package com.example.knp.njsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCon;
    Button btnSend;
    TextView tvLogs;
    TextView tvState;
    EditText etMes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCon = (Button)findViewById(R.id.btnConnect);
        btnSend = (Button)findViewById(R.id.btnSend);
        tvLogs = (TextView)findViewById(R.id.tvLogs);
        tvState = (TextView)findViewById(R.id.tvState);
        etMes = (EditText)findViewById(R.id.etMes);
    }
}
