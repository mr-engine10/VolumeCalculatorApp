package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText cube_side;
    TextView title_cube, result_cube;
    Button btn_cube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cube_side = findViewById(R.id.editText_cube);
        title_cube = findViewById(R.id.textViewCube);
        result_cube = findViewById(R.id.textViewCubeResult);
        btn_cube = findViewById(R.id.btn_cube);

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String side = cube_side.getText().toString();

                int a = Integer.parseInt(side);

                // V = a^3

                double volume = a*a*a;
                result_cube.setText("V = "+volume+" m^3");
            }
        });
    }
}