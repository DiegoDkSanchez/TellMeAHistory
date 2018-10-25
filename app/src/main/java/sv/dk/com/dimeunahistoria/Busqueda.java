package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Busqueda extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
    }

    public void navegacionInicio(View view) {
        Intent intent = new Intent(Busqueda.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void navegacionBuscar(View view) {

    }

    public void navegacionFavoritos(View view) {
        Intent intent = new Intent(Busqueda.this, Favoritos.class);
        startActivity(intent);
        finish();
    }

    public void navegacionPerfil(View view){
        Intent intent = new Intent(Busqueda.this, Perfil.class);
        startActivity(intent);
        finish();
    }
}
