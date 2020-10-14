package jesuitas.dam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarTexto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_texto);

        Intent intent = getIntent();
        String textoExtra = intent.getStringExtra("texto");

        TextView texto = findViewById(R.id.textView);
        texto.setText(textoExtra);
    }
}