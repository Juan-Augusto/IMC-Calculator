package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculateIMC (View view){
        EditText weight, height;
        TextView IMCOutput;

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);

        double heightValue = Double.parseDouble(height.getText().toString());
        double weightValue = Double.parseDouble(weight.getText().toString());

        IMCOutput = findViewById(R.id.IMCOutput);
        double IMCValue = weightValue / Math.pow(heightValue, 2);

        if (IMCValue < 18.5){
            IMCOutput.setText("Abaixo do peso normal");
        }else if (18.5 <= IMCValue && IMCValue <= 24.9 ){
            IMCOutput.setText("Peso normal");
        } else if (25 <= IMCValue && IMCValue <= 29.9) {
            IMCOutput.setText("Excesso de peso");
        } else if (30 <= IMCValue && IMCValue <= 34.9) {
            IMCOutput.setText("Obesidade classe I");
        } else if (35 <= IMCValue && IMCValue <= 39.9) {
            IMCOutput.setText("Obesidade classe II");
        } else {
            IMCOutput.setText("Obesidade classe III");
        }

    }
}