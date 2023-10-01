package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinder_radius, cylinder_height;
    TextView title_cylinder, result_cylinder;
    Button btn_cylinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinder_radius = findViewById(R.id.editText_cylinderRadius);
        cylinder_height = findViewById(R.id.editText_cylinderHeight);
        title_cylinder = findViewById(R.id.textViewCylinder);
        result_cylinder = findViewById(R.id.textViewCylinderResult);
        btn_cylinder = findViewById(R.id.btn_cylinder);


        btn_cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinder_radius.getText().toString();
                String height = cylinder_height.getText().toString();

                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                // V = Pi*r^2*h
                double volume = 3.14159*r*r*h;
                result_cylinder.setText("V = "+volume+" m^3");
            }
        });
    }
}