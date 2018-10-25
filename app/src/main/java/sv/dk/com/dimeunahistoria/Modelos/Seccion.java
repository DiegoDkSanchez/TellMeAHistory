package sv.dk.com.dimeunahistoria.Modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by DK-Ragnar on 8/9/2018.
 */

public class Seccion implements Serializable{

    private String subtitulo;
    private String contenido;
    @SerializedName("imagen")
    private String iamgen;

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getIamgen() {
        return iamgen;
    }

    public void setIamgen(String iamgen) {
        this.iamgen = iamgen;
    }

}
