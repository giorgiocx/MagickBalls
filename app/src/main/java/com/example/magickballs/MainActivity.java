package com.example.magickballs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView foto;
    private TextView texto;
    private String[] papaya={"Es cierto", "Definitivamente es así", "Sin duda", "Nunca uses Apple", "Sí definitivamente","Para que quieres saber eso?", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde", "No vuelvas a preguntar eso", "shh, los veganos estan escuchando, siempre escuchan",
            "Dejalo, no te ama", "no", "Ella pregunto lo mismo", "No dejes que tus dudas te carcoman el alma", "Juanes te ama, no lo olvides", " Mi perro pregunta mejores cosas con mas sentido",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso","El dolor, es una ilusion de la realidad",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foto=findViewById(R.id.ball8);
        texto=findViewById(R.id.textoSecundario);
        foto.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ball8:
                int numero = new Random().nextInt(papaya.length);
                texto.setText(papaya[numero]);
        }
    }
}
