package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText prism_base, prism_height;
    TextView title_prism, result_prism;
    Button btn_prism;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prism_base = findViewById(R.id.editText_prismBase);
        prism_height = findViewById(R.id.editText_prismHeight);
        title_prism = findViewById(R.id.textViewPrism);
        result_prism = findViewById(R.id.textViewPrismResult);
        btn_prism = findViewById(R.id.btn_prism);



        btn_prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base = prism_base.getText().toString();
                String height = prism_height.getText().toString();

                int b = Integer.parseInt(base);
                int h = Integer.parseInt(height);

                // V = B * h
                double volume = b*h;
                result_prism.setText("V = "+volume+" m^3");
            }
        });
    }
}