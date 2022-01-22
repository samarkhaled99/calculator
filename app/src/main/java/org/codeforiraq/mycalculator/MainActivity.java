package org.codeforiraq.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myResult;
    EditText number1;
    EditText number2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myResult.findViewById(R.id.myResult);
        number1.findViewById(R.id.number1);
        number2.findViewById(R.id.number2);
        button.findViewById(R.id.buttonSum);

    }

    public void onClickSum(View view) {


        if (!number1.getText().toString().equals("") &&
                !number2.getText().toString().equals("")) {

            double myNumber1 = Double.parseDouble(number1.getText().toString());
            double myNumber2 = Double.parseDouble(number2.getText().toString());
            myResult.setText("Result : " + (myNumber1 + myNumber2));
        } else {
            myResult.setText("Please put numbers");
        }

      }}



