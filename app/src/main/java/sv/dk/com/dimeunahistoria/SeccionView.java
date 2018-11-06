package sv.dk.com.dimeunahistoria;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import sv.dk.com.dimeunahistoria.Model.CategoriesItem;
import sv.dk.com.dimeunahistoria.Model.StoryItem;
import sv.dk.com.dimeunahistoria.Modelos.Seccion;
import sv.dk.com.dimeunahistoria.Modelos.SectionsItem;
import sv.dk.com.dimeunahistoria.Speaker.SpeakRequest;

public class SeccionView extends AppCompatActivity {

    ImageView imagen, banner;
    TextView contenido, titulo, subtitulo, numPaginas;
    Button atras, adelante, listenButton;
    CardView cardView;

    private int pagina;
    private SpeakRequest speakRequest;
    private CategoriesItem categoriesItem;
    private StoryItem historia;
    private sv.dk.com.dimeunahistoria.Model.SectionsItem seccion;
    private boolean NotIsFinalPage = true;
    private ArrayList<Seccion> secciones = new ArrayList<>();
    MediaPlayer mediaPlayer = new MediaPlayer();
    private ProgressBar loading;

    CacheableAudio cacheableAudio = new CacheableAudio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_view);


        //FindViewById
        banner = findViewById(R.id.imgBannerSeccion);
        listenButton = findViewById(R.id.listenButton);
        imagen = (ImageView) findViewById(R.id.imagenHistoria);
        contenido = (TextView) findViewById(R.id.txtContenidoHistoria);
        atras = (Button) findViewById(R.id.bottomAtras);
        adelante = (Button) findViewById(R.id.bottomAdelante);
        titulo = (TextView) findViewById(R.id.txtTituloSeccion);
        subtitulo = (TextView) findViewById(R.id.txtSubtituloSeccion);
        numPaginas = (TextView) findViewById(R.id.txtNumPagina);
        cardView = findViewById(R.id.CardViewSeccion);
        pagina = (int) getIntent().getSerializableExtra("pagina");
        categoriesItem = (CategoriesItem) getIntent().getSerializableExtra("categoriesItem");
        historia = (StoryItem) getIntent().getSerializableExtra("storyItem");
        //secciones = (ArrayList<Seccion>) getIntent().getSerializableExtra("lista");
        seccion = historia.getSections().get(pagina);

        if(speakRequest == null) {
            speakRequest = new SpeakRequest(this);
        }

        if(pagina== historia.getSections().size()-1){
            adelante.setVisibility(View.INVISIBLE);
            NotIsFinalPage = false;
        }
        if(seccion.getUrl() != null){
            Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                    seccion.getUrl()).into(imagen);
        }else {
            Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                    categoriesItem.getUrl()).into(imagen);
        }

        Glide.with(banner.getContext()).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                categoriesItem.getUrlBanner()).into(banner);

        banner.setClickable(true);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeccionView.this, HistoriaDetalle.class);
                intent.putExtra("category", categoriesItem);
                startActivity(intent);
                finish();
            }
        });

//      titulo.setText(categoriesItem.getName());
        if(seccion.getName()!=null){
//            subtitulo.setText(seccion.getName());
        }else {
  //          subtitulo.setVisibility(View.INVISIBLE);
        }
        int paginaReal = pagina+1;
//        numPaginas.setText("Pagina "+paginaReal);
        //Contenidooooooooooooooooooooooooooooooooooooooooooooooooooooooo
    //    contenido.setText(seccion.getDescription());

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pagina != 0) {
                    Intent intent = new Intent(SeccionView.this, SeccionView.class);
                    intent.putExtra("categoriesItem", categoriesItem);
                    intent.putExtra("storyItem", historia);
                    //intent.putExtra("lista", categoriesItem.getSections());
                    pagina -= 1;
                    intent.putExtra("pagina", pagina);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    speakRequest.stopSpeak();
                    finish();
                    StopMedia();
                }else {
                    Intent intent = new Intent(SeccionView.this, HistoriaDetalle.class);
                    intent.putExtra("categoriesItem", categoriesItem);
                    startActivity(intent);
                    finish();
                    StopMedia();
                }
            }
        });

        adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeccionView.this, SeccionView.class);
                intent.putExtra("categoriesItem", categoriesItem);
                intent.putExtra("storyItem", historia);
                //intent.putExtra("lista", categoriesItem.getSecciones());
                pagina += 1;
                intent.putExtra("pagina", pagina);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
                speakRequest.stopSpeak();
                startActivity(intent);
                finish();
                StopMedia();
            }
        });


        cardView.setOnTouchListener(new OnSwipeTouchListener(SeccionView.this) {
            public void onSwipeTop() {
              //  Toast.makeText(SeccionView.this, "top", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                if(pagina != 0) {
                    Intent intent = new Intent(SeccionView.this, SeccionView.class);
                    intent.putExtra("categoriesItem", categoriesItem);
                    intent.putExtra("storyItem", historia);
                    //intent.putExtra("lista", categoriesItem.getSections());
                    pagina -= 1;
                    intent.putExtra("pagina", pagina);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    speakRequest.stopSpeak();
                    finish();
                    StopMedia();
                }else {
                    Intent intent = new Intent(SeccionView.this, HistoriaDetalle.class);
                    intent.putExtra("categoriesItem", categoriesItem);
                    intent.putExtra("storyItem", historia);
                    startActivity(intent);
                    finish();
                    StopMedia();
                }
            }
            public void onSwipeLeft() {
                if(NotIsFinalPage){
                    Intent intent = new Intent(SeccionView.this, SeccionView.class);
                    intent.putExtra("categoriesItem", categoriesItem);
                    intent.putExtra("storyItem", historia);
                    //intent.putExtra("lista", categoriesItem.getSecciones());
                    pagina += 1;
                    intent.putExtra("pagina", pagina);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
                    speakRequest.stopSpeak();
                    startActivity(intent);
                    finish();
                    StopMedia();
                }
            }
            public void onSwipeBottom() {
               // Toast.makeText(SeccionView.this, "bottom", Toast.LENGTH_SHORT).show();
            }

        });

    }

    public void escucharSeccion(View view) {


        cacheableAudio.playCacheableAudio(this, "http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/audio/"+seccion.getAudioUrl());

        /*Uri myUri = Uri.parse(f.getAbsolutePath());
        if(mediaPlayer.isPlaying()){

        }else{
            try {
                mediaPlayer.setDataSource(this, myUri);
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mediaPlayer.prepare(); //don't use prepareAsync for mp3 playback

                mediaPlayer.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    private File getTempFile(Context context, String url) {
        File file = null;
        try {
            String fileName = Uri.parse(url).getLastPathSegment();
            file = File.createTempFile(fileName, null, context.getCacheDir());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private void StopMedia(){
        mediaPlayer.stop();
    }
}
