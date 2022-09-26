package com.mdp.formrelatif_2125250036_20sept;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText etnpm,etnama;
    private RadioGroup rgjk;
    private RadioButton rbjk;
    private Spinner spProdi;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnpm = findViewById(R.id.et_npm);
        etnama = findViewById(R.id.et_name);
        rgjk = findViewById(R.id.rg_jk);
        spProdi = findViewById(R.id.sp_prodi);
        btndaftar = findViewById(R.id.btn_daftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String npm, nama, jk, prodi;
                int selectedid;

                npm = etnpm.getText().toString();
                nama = etnama.getText().toString();
                prodi = spProdi.getSelectedItem().toString();
                //rb & rg
                selectedid = rgjk.getCheckedRadioButtonId();
                rbjk= findViewById(selectedid);
                jk = rbjk.getText().toString();
                //cek
                if(npm.trim().equals(""))
                {
                    etnpm.setError("NPM tidak boleh kosong");
                }
                if (nama.trim().equals(""))
                {
                    etnama.setError("Nama tidak boleh kosong");
                }
            Intent intent = new Intent(MainActivity.this, ResultForm.class);
                intent.putExtra("varNPM",npm);
                intent.putExtra("varNama", nama);
                intent.putExtra("varjk", jk);
                intent.putExtra("varprodi", prodi);
                startActivity(intent);
            }
        });
    }
}