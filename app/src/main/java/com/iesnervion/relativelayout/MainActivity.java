package com.iesnervion.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText result;
    String numero="";
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (EditText) findViewById(R.id.resultados);




    }

    public void clickOnButton(View view) {
        switch (view.getId()){
            case(R.id.C): numero="";
            break;
            case(R.id.div): numero +="/";
            break;
            case(R.id.mult): numero +="*";
            break;

            case(R.id.siete): numero +="7";
                break;
            case(R.id.ocho): numero+="8";
            break;
            case(R.id.nueve): numero +="9";
                break;
            case(R.id.res): numero +="-";
                break;
            case(R.id.cuatro): numero +="4";
                break;
            case(R.id.cinco): numero +="5";
                break;
            case(R.id.seis): numero +="6";
                break;
            case(R.id.sum): numero +="+";
                break;
            case(R.id.uno): numero +="1";
                break;
            case(R.id.dos): numero +="2";
                break;
            case(R.id.tres): numero +="3";
                break;
            case(R.id.parLeft): numero +="(";
                break;
            case(R.id.cero): numero +="0";
                break;
            case(R.id.igual): ;
                break;
        }
        result.setText(numero);
    }

    public String  calcularRes(){
        // String Split (reg ) y almacenar en un array
        // Luego comprobar si es un numero o un signo en cada posición y añadirlo a la
        // operación
        int[]numeros = new int [100];
        char[]signos= new char[100];
        String aux = String.valueOf(result.getText());
        for (int i = 0; i < aux.length(); i++) {
            if (aux.charAt(i)){

            }

        }
    }
}