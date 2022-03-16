package com.prodigio.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view){

        /* aprendendo a utilizar o Toast, dessa maneira abaixo é mais complicada mas permite deixar
        personalizal
         */

        ImageView imagem = new ImageView(this);
        imagem.setImageResource(android.R.drawable.star_big_off);

        TextView textView = new TextView(this);
        textView.setText("Olá Toast");

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        //toast.setView(imagem);
        toast.setView(textView);
        toast.show();


        /*
        Toast.makeText(
           getApplicationContext(),
           "Ação realizada com sucesso!",
                Toast.LENGTH_LONG
        ).show();
         */

    }
}