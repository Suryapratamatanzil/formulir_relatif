package com.mdp.formrelatif_2125250036_20sept;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultForm extends AppCompatActivity {
    private TextView tvNpm, tvNama, tvProdi, tvJk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_form);

        tvNama = findViewById(R.id.tv_nama);
        tvNpm= findViewById(R.id.tv_npm);
        tvProdi = findViewById(R.id.tv_prodi);
        tvJk = findViewById(R.id.tv_jk);

        Intent intent = getIntent();
        tvNpm.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvProdi.setText(intent.getStringExtra("varprodi"));
        tvJk.setText(intent.getStringExtra("varjk"));
    }
}