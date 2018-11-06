package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sv.dk.com.dimeunahistoria.Adapters.HistoriasAdapter;
import sv.dk.com.dimeunahistoria.Model.CategoriesItem;
import sv.dk.com.dimeunahistoria.Model.ResponseNew;
import sv.dk.com.dimeunahistoria.Modelos.ResponseData;
import sv.dk.com.dimeunahistoria.Modelos.Story;

public class MainActivity extends AppCompatActivity implements HistoriasAdapter.ItemClickListener {

    RecyclerView recyclerView;
    HistoriasAdapter adaptador;
    List<CategoriesItem> listaCategorias;
    SwipeRefreshLayout swipeRefreshLayout;

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd")
            .create();


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ServicioHistorias.base_url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    ServicioHistorias apiService = retrofit.create(ServicioHistorias.class);
    Call<ResponseNew> call = apiService.getCategories();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FindViewById
        recyclerView = (RecyclerView) findViewById(R.id.reciclerView);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        listaCategorias = new ArrayList<>();

        swipeRefreshLayout.setRefreshing(true);
        CallBackAll();

        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(MainActivity.this, R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
               call.cancel();
                if(call.isCanceled()){
                    apiService = retrofit.create(ServicioHistorias.class);
                    call = apiService.getCategories();
                    Log.d("WTF","WTF");
                }
                CallBackAll();
            }
        });

    }

    @Override
    public void onItemClick(View view, int position) {


        CategoriesItem category = listaCategorias.get(position);

        Intent intent = new Intent(this, HistoriaDetalle.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }

    private void CallBackAll() {
        call.enqueue(new Callback<ResponseNew>() {
                @Override
            public void onResponse(Call<ResponseNew> call, Response<ResponseNew> response) {
                listaCategorias = response.body().getData();
                recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
                adaptador = new HistoriasAdapter(MainActivity.this, listaCategorias);
                recyclerView.setAdapter(adaptador);
                adaptador.setClickListener(MainActivity.this);
                swipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<ResponseNew> call, Throwable t) {
                Log.d("UDBLOG:Error",t.getMessage());
                swipeRefreshLayout.setRefreshing(false);
                Toast desconectado = Toast.makeText(MainActivity.this, "Desconectado", Toast.LENGTH_LONG);
                desconectado.show();
            }
        });
    }


    public void navegacionInicio(View view) {

    }

    public void navegacionBuscar(View view) {
        Intent intent = new Intent(MainActivity.this, Busqueda.class);
        startActivity(intent);
        finish();
    }

    public void navegacionFavoritos(View view) {
        Intent intent = new Intent(MainActivity.this, Favoritos.class);
        startActivity(intent);
        finish();
    }

    public void navegacionPerfil(View view){
        Intent intent = new Intent(MainActivity.this, Perfil.class);
        startActivity(intent);
        finish();
    }
}
