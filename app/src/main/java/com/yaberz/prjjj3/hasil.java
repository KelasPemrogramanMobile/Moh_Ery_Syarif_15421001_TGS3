package com.yaberz.prjjj3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView txttNama, txttAlamat, txttTtl, txttPassword, txttAgama, txttJk;
    Intent Nama, Alamat, Ttl, Password, Agama, jk;
    String strNama, strAlamat, strTtl, strPassword, strAgama, strJk;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txttNama        = (TextView) findViewById(R.id.textNama);
        txttAlamat      = (TextView) findViewById(R.id.textAlamat);
        txttTtl         = (TextView) findViewById(R.id.textTtl);
        txttPassword    = (TextView) findViewById(R.id.textPassword);
        txttAgama       = (TextView) findViewById(R.id.textAgama);
        txttJk          = (TextView) findViewById(R.id.textJk);
        btnback         = (Button) findViewById(R.id.kembali);

        Nama = getIntent();
        strNama = Nama.getStringExtra("Nama");
        txttNama.setText(strNama);

        Alamat = getIntent();
        strAlamat = Alamat.getStringExtra("Alamat");
        txttAlamat.setText(strAlamat);

        Ttl = getIntent();
        strTtl = Ttl.getStringExtra("Ttl");
        txttTtl.setText(strTtl);

        Password = getIntent();
        strPassword = Password.getStringExtra("Password");
        txttPassword.setText(strPassword);

        Agama = getIntent();
        strAgama = Agama.getStringExtra("Agama");
        txttAgama.setText(strAgama);

        jk = getIntent();
        strJk = jk.getStringExtra("JenisKelamin");
        txttJk.setText(strJk);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(hasil.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}



