package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import sv.dk.com.dimeunahistoria.Adapters.sectionAdapter;
import sv.dk.com.dimeunahistoria.Model.CategoriesItem;
import sv.dk.com.dimeunahistoria.Model.StoryItem;
import sv.dk.com.dimeunahistoria.Modelos.SectionsItem;

public class HistoriaDetalle extends AppCompatActivity{

    CategoriesItem categoriesItem;
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

        categoriesItem = (CategoriesItem) getIntent().getSerializableExtra("category");

        /*
        Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+categoriesItem.getUrl()).into(portada);
        titulo.setText(categoriesItem.getName())seccionRecycler;
        if(categoriesItem.getCategory()!= null){
            categoria.setText(categoriesItem.getCategory().getName());
        }*/

        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(HistoriaDetalle.this, R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();
        recyclerView.setLayoutManager(new GridLayoutManager(HistoriaDetalle.this, 2));
        adapter = new sectionAdapter(categoriesItem.getStory(), R.layout.item_reciclerview, new sectionAdapter.onItemClickListener() {
            @Override
            public void onItemClick(StoryItem story, int position) {
                StoryItem storyItem = categoriesItem.getStory().get(position);

                Intent intent = new Intent(HistoriaDetalle.this, SeccionView.class);
                intent.putExtra("categoriesItem", categoriesItem);
                intent.putExtra("storyItem", categoriesItem.getStory().get(position));
                //intent.putExtra("lista", categoriesItem.getSections());
                intent.putExtra("pagina", 0);
                if(categoriesItem.getStory().get(position).getSections() == null || categoriesItem.getStory().get(position).getSections().size() == 0) {
                    Toast.makeText(getApplicationContext(),"Historia sin contenido", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(intent);
                    finish();
                }
            }
        });

        recyclerView.setAdapter(adapter);
        Glide.with(banner.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                categoriesItem.getUrlBanner()).into(banner);

        banner.setClickable(true);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoriaDetalle.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



    public void leerAhora(View view) {
        Intent intent = new Intent(this, SeccionView.class);
        intent.putExtra("categoriesItem", categoriesItem);
        //intent.putExtra("lista", categoriesItem.getSections());
        intent.putExtra("pagina", 0);
        if(categoriesItem.getStory() == null || categoriesItem.getStory().size() == 0) {
            Toast.makeText(getApplicationContext(),"Historia sin contenido", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(intent);
            finish();
        }
    }

}
