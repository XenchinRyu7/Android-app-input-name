package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textNama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.biru_muda)));

        textNama = findViewById(R.id.editNama);
        hasil = findViewById(R.id.textViewLabel);
    }

    public void tampilNama(View v) {
        hasil.setText("Nama Anda : " + textNama.getText());
    }
}