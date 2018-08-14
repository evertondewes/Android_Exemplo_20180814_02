package com.example.cnec.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void pressionarBotao(View v) {

        EditText et = (EditText) findViewById(R.id.etNome);
        EditText etS = (EditText) findViewById(R.id.etSobrenome);
        TextView tv = (TextView) findViewById(R.id.tvNome);

        String nome = et.getText().toString();

        String sobrenome = etS.getText().toString();


        tv.setText(tv.getText() + "\n" +nome + " " + sobrenome);

        Log.i("Nome", et.getText().toString());
    }

    public void pressionarBotao2222(View v) {

        Log.v("teste1", "teste2");
    }

}
