package com.example.micalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tvt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvt1=(TextView) findViewById(R.id.tvt1);

    }
    public void Sumar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=n1+n2;
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Restar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        float n1=Float.parseFloat(valor1);
        float n2=Float.parseFloat(valor2);
        float resultado=n1-n2;
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Multiplicar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=n1*n2;
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Division(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int resultado=0;
        if (n2!=0){
            resultado=n1/n2;
        }
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Cos(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double resultado=Math.cos(Math.PI*(n1)/180);
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Tan(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double resultado=Math.tan(Math.PI*(n1)/180);
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }
    public void Sin(View view){
        String valor1=et1.getText().toString();
        double n1=Double.parseDouble(valor1);
        double resultado=Math.sin(Math.PI*(n1)/180);
        String res=String.valueOf(resultado);
        tvt1.setText(res);

    }

    }