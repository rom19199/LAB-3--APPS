package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText edad;
    private TextView recomend;
    private ImageButton btn1;
    private Button btnVirus;
    private  Button btnSintomas;
    private  Button btnIndicaciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.etNombre);
        edad = (EditText)findViewById(R.id.etEdad);
        recomend = (TextView)findViewById(R.id.tv3);
        btn1 =(ImageButton)findViewById(R.id.imgBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age;
                String miEdad = null;
                miEdad = edad.getText().toString();
                String miNombre = null;
                miNombre = nombre.getText().toString();
                age = Integer.parseInt(miEdad);
                if(age<10){
                    recomend.setText(miNombre + ", su edad es: "+miEdad+", pertenece al grupo de riesgo medio");
                }
                else if(age<50){
                    recomend.setText(miNombre + ", su edad es: "+miEdad+", pertenece al grupo de riesgo bajo");
                }
                else if(age<110){
                    recomend.setText(miNombre + ", su edad es: "+miEdad+", pertenece al grupo de riesgo alto");
                }


            }
        });

        btnVirus = (Button)findViewById(R.id.btn2);
        btnVirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnVirus = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(btnVirus);

            }
        });

        btnSintomas = (Button)findViewById(R.id.btn3);
        btnSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSintomas = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(btnSintomas);

            }
        });
        btnIndicaciones = (Button)findViewById(R.id.btn4);
        btnIndicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIndicaciones = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(btnIndicaciones);

            }
        });



    }
}
