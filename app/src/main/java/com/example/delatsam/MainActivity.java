package com.example.delatsam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText number1, number2, number3;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.button);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        number3 = findViewById(R.id.number3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double number1, number2, number3;
                    number1 = Double.parseDouble(number1.getText().toString());
                    number2 = Double.parseDouble(number2.getText().toString());

                    result.setText(num1 + num2 + "");
                    //передаём результат

                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("data", number1 + number2 + number3 + "");
                    startActivity(intent);

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Ошибка" + e.getMessage(), Toast.LENGTH_LONG);
                }
            }
        });
    }
}