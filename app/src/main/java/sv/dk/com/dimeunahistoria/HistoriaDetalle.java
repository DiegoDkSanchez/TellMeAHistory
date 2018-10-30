package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import sv.dk.com.dimeunahistoria.Adapters.HistoriasAdapter;
import sv.dk.com.dimeunahistoria.Adapters.SeccionAdapter;
import sv.dk.com.dimeunahistoria.Adapters.sectionAdapter;
import sv.dk.com.dimeunahistoria.Modelos.Historia;
import sv.dk.com.dimeunahistoria.Modelos.Seccion;
import sv.dk.com.dimeunahistoria.Modelos.SectionsItem;
import sv.dk.com.dimeunahistoria.Modelos.Story;

public class HistoriaDetalle extends AppCompatActivity{

    Story historia;
    ImageView portada, banner;
    TextView titulo, categoria, autor;
    LinearLayout fondoDetalle;
    RecyclerView recyclerView;
    //SeccionAdapter adaptador;
    sectionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_detalle);

        recyclerView = (RecyclerView) findViewById(R.id.seccionRecycler);
        banner = findViewById(R.id.imgBanner);

        //findViewById
        /*
        portada = (ImageView) findViewById(R.id.portadaDetalle);

        titulo = (TextView) findViewById(R.id.txtTituloDetalle);
        categoria = (TextView) findViewById(R.id.txtCategoriaDetalle);
        fondoDetalle = (LinearLayout) findViewById(R.id.fondoDetalle);*/

        historia = (Story) getIntent().getSerializableExtra("historia");

        /*
        Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+historia.getUrl()).into(portada);
        titulo.setText(historia.getName())seccionRecycler;
        if(historia.getCategory()!= null){
            categoria.setText(historia.getCategory().getName());
        }*/

        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(HistoriaDetalle.this, R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();
        recyclerView.setLayoutManager(new GridLayoutManager(HistoriaDetalle.this, 2));
        adapter = new sectionAdapter(historia.getSections(), R.layout.item_reciclerview, new sectionAdapter.onItemClickListener() {
            @Override
            public void onItemClick(SectionsItem sectionsItem, int position) {
                SectionsItem section = historia.getSections().get(position);

                Intent intent = new Intent(HistoriaDetalle.this, SeccionView.class);
                intent.putExtra("historia", historia);
                //intent.putExtra("lista", historia.getSections());
                intent.putExtra("pagina", position);
                if(historia.getSections() == null || historia.getSections().size() == 0) {
                    Toast.makeText(getApplicationContext(),"Historia sin contenido", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(intent);
                    finish();
                }
            }
        });

        recyclerView.setAdapter(adapter);
        Glide.with(banner.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                historia.getUrlBanner()).into(banner);

    }



    public void leerAhora(View view) {
        Intent intent = new Intent(this, SeccionView.class);
        intent.putExtra("historia", historia);
        //intent.putExtra("lista", historia.getSections());
        intent.putExtra("pagina", 0);
        if(historia.getSections() == null || historia.getSections().size() == 0) {
            Toast.makeText(getApplicationContext(),"Historia sin contenido", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(intent);
            finish();
        }
    }

}
