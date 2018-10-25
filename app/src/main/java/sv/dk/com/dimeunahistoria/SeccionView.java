package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import sv.dk.com.dimeunahistoria.Modelos.Historia;
import sv.dk.com.dimeunahistoria.Modelos.Seccion;
import sv.dk.com.dimeunahistoria.Modelos.SectionsItem;
import sv.dk.com.dimeunahistoria.Modelos.Story;
import sv.dk.com.dimeunahistoria.Speaker.SpeakRequest;

public class SeccionView extends AppCompatActivity {

    ImageView imagen;
    TextView contenido, titulo, subtitulo, numPaginas;
    Button atras, adelante;

    private int pagina;
    private SpeakRequest speakRequest;
    private Story historia;
    private SectionsItem seccion;
    private ArrayList<Seccion> secciones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_view);

        //FindViewById
        imagen = (ImageView) findViewById(R.id.imagenHistoria);
        contenido = (TextView) findViewById(R.id.txtContenidoHistoria);
        atras = (Button) findViewById(R.id.bottomAtras);
        adelante = (Button) findViewById(R.id.bottomAdelante);
        titulo = (TextView) findViewById(R.id.txtTituloSeccion);
        subtitulo = (TextView) findViewById(R.id.txtSubtituloSeccion);
        numPaginas = (TextView) findViewById(R.id.txtNumPagina);

        pagina = (int) getIntent().getSerializableExtra("pagina");
        historia = (Story) getIntent().getSerializableExtra("historia");
        //secciones = (ArrayList<Seccion>) getIntent().getSerializableExtra("lista");
        seccion = historia.getSections().get(pagina);

        if(speakRequest == null) {
            speakRequest = new SpeakRequest(this);
        }

        if(pagina==historia.getSections().size()-1){
            adelante.setVisibility(View.INVISIBLE);
        }
        if(seccion.getUrl() != null){
            Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                    seccion.getUrl()).into(imagen);
        }else {
            Glide.with(this).load("http://ec2-54-244-63-119.us-west-2.compute.amazonaws.com/story/public/images/"+
                    historia.getUrl()).into(imagen);
        }

//      titulo.setText(historia.getName());
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
                    intent.putExtra("historia", historia);
                    //intent.putExtra("lista", historia.getSections());
                    pagina -= 1;
                    intent.putExtra("pagina", pagina);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    speakRequest.stopSpeak();
                    finish();
                }else {
                    Intent intent = new Intent(SeccionView.this, HistoriaDetalle.class);
                    intent.putExtra("historia", historia);
                    startActivity(intent);
                    finish();
                }
            }
        });

        adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeccionView.this, SeccionView.class);
                intent.putExtra("historia", historia);
                //intent.putExtra("lista", historia.getSecciones());
                pagina += 1;
                intent.putExtra("pagina", pagina);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
                speakRequest.stopSpeak();
                startActivity(intent);
                finish();
            }
        });

    }

    public void escucharSeccion(View view) {
        if(speakRequest.isSpeaking()){
            speakRequest.stopSpeak();
        }
        String texto = seccion.getName()+". \n"+seccion.getDescription();
        speakRequest.speak(texto);
    }
}
