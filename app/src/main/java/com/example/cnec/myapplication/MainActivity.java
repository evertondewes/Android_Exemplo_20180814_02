package com.example.cnec.myapplication;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n" + "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n" + "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n" + "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n" + "onPause");

        ConstraintLayout cl = findViewById(R.id.telaInicial);
        cl.setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onResume() {
        super.onResume();

        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n" + "onResume");

        ConstraintLayout cl = findViewById(R.id.telaInicial);
        cl.setBackgroundColor(Color.BLUE);
    }

    public void pressionarBotao(View v) {
        TextView tv = (TextView) findViewById(R.id.tvNome);
        tv.setText(tv.getText() + "\n");

        ConstraintLayout cl = findViewById(R.id.telaInicial);
        cl.setBackgroundColor(Color.YELLOW);
    }


}
