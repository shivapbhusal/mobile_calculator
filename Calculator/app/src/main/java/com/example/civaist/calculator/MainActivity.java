package com.example.civaist.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    public static String expression;
    TextView textInput;
    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        expression = "";
        textInput = (TextView) findViewById(R.id.edit_input);
        textOutput = (TextView) findViewById(R.id.edit_output);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInputOutput();
    }

    public void onClickButton(View view) {
        Toast.makeText(MainActivity.this,"Hello one !", Toast.LENGTH_LONG).show();
    }

    public void setInputOutput()
    {
        textInput.setText("Hello");
    }
}



