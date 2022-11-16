package com.example.testdebugs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText aField;
    EditText bField;
    EditText cField;
    Button button;

    private void log(String message){
        Log.d("LOG_TAG", message);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log("created");
        setupUI();
    }

    private void setupUI() {
        aField = findViewById(R.id.a_field);
        bField = findViewById(R.id.b_field);
        cField = findViewById(R.id.c_field);
        button = findViewById(R.id.button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("stoped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("destroyed");
    }

    public void click(View view) {
        double a = Double.parseDouble(aField.getText().toString());
        double b = Double.parseDouble(bField.getText().toString());
        double c = Double.parseDouble(cField.getText().toString());
        double result = (c-a)/b;

        Toast.makeText(this, result+"", Toast.LENGTH_SHORT).show();
    }
}