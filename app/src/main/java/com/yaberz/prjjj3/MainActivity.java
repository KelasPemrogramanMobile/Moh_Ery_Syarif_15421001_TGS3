package com.yaberz.prjjj3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText txtNama, txtAlamat, txtTtl, txtPswd;
    private Spinner txtAgama;
    private RadioGroup txtJk;
    private RadioButton txtBtn;
    private Button btnGetData;
    String Nama, Alamat, Ttl, Password, Agama, btnjk;
    int jeniskelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNama         = (EditText) findViewById(R.id.isiNama);
        txtAlamat       = (EditText) findViewById(R.id.isiAlamat);
        txtTtl          = (EditText) findViewById(R.id.isiTtl);
        txtPswd         = (EditText) findViewById(R.id.isiPassword);
        txtAgama        = (Spinner) findViewById(R.id.sp_name);
        txtJk           = (RadioGroup) findViewById(R.id.radioGrupNb);
        btnGetData      = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nama = txtNama.getText().toString();
                Alamat = txtAlamat.getText().toString();
                Ttl = txtTtl.getText().toString();
                Password = txtPswd.getText().toString();
                Agama = txtAgama.getSelectedItem().toString();
                jeniskelamin = txtJk.getCheckedRadioButtonId();
                txtBtn = (RadioButton) findViewById(jeniskelamin);
                btnjk = txtBtn.getText().toString();

                Intent go = new Intent(MainActivity.this, hasil.class);
                go.putExtra("Nama", Nama);
                go.putExtra("Alamat", Alamat);
                go.putExtra("Ttl", Ttl);
                go.putExtra("Password", Password);
                go.putExtra("JenisKelamin", btnjk);
                go.putExtra("Agama", Agama);
                startActivity(go);

                finish();

            }
            });
        }
    }
