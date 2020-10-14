package jesuitas.dam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int cantidad = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decremeto(View view) {
        cantidad--;
        TextView cambiarTextodecre = findViewById(R.id.text4);
        cambiarTextodecre.setText(String.valueOf(cantidad));
    }

    private void incremento(View view) {
        cantidad++;
        TextView cambiarTextoincre = findViewById(R.id.text4);
        cambiarTextoincre.setText(String.valueOf(cantidad));
    }


    public void showToast(View view) {

        double precioUnidad = 1.50;

        EditText TextoEditado = findViewById(R.id.text1);
        String texto = TextoEditado.getText().toString();
        String texto_cantidad = texto + getString(R.string.you_ordered) + cantidad + getString(R.string.coffee);

        CheckBox nata = findViewById(R.id.checkBox1);
        boolean seleccrionarNata = nata.isChecked();

        CheckBox chocolate = findViewById(R.id.checkBox2);
        boolean seleccionarChocolate = chocolate.isChecked();

        if(seleccrionarNata){
            texto_cantidad += getString(R.string.Whipped_Cream);
            precioUnidad += 0.50;
            if(seleccionarChocolate){
                texto_cantidad += getString(R.string.and);
            }
        }

        if(seleccionarChocolate){
            texto_cantidad += getString(R.string.with_Chocolate);
            precioUnidad += 0.50;
        }

        double precioTotal = precioUnidad * cantidad;
        String texto_final = texto_cantidad + "\n" + precioTotal;

        Intent intent = new Intent(this, MostrarTexto.class);
        intent.putExtra("texto", texto_final);
        startActivity(intent);


    }


}