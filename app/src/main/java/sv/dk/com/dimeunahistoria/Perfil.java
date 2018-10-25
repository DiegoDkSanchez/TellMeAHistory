package sv.dk.com.dimeunahistoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void navegacionInicio(View view) {
        Intent intent = new Intent(Perfil.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void navegacionBuscar(View view) {
        Intent intent = new Intent(Perfil.this, Busqueda.class);
        startActivity(intent);
        finish();
    }

    public void navegacionFavoritos(View view) {
        Intent intent = new Intent(Perfil.this, Favoritos.class);
        startActivity(intent);
        finish();
    }

    public void navegacionPerfil(View view){

    }
}
