package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    EditText et1 =findViewById(R.id.et1);
    EditText et2 =findViewById(R.id.et2);
    EditText et3 =findViewById(R.id.et3);
    int contador;

    public void Contar{
        String textoComprobar=et1.getText().toString();
        String letra=et2.getText().toString();

        while (textoComprobar==letra){
             contador++;
        }
    }
}