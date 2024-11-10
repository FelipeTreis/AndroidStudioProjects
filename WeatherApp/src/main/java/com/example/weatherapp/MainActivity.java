package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Adicione aqui um layout para a SplashScreen, se desejar
        new Handler().postDelayed(() -> {
            // Iniciar a MainActivity após o delay de 3 segundos
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish(); // Fechar a SplashScreen
        }, 3000); // Tempo em milissegundos (3 segundos)
    }
}
