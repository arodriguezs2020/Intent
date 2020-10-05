package jesuitas.dam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mshowHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowHello = findViewById(R.id.text4);  // Enlazamos el metodo mshowHello con un TextView
    }

    public void showToast(View view) {
        mshowHello.setText(R.string.hello_text);
    }
}