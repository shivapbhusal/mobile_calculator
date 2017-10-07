package com.example.civaist.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button addButton;
    Button subButton;
    Button mulButton;
    Button divButton;
    EditText num1;
    EditText num2;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton=(Button)findViewById(R.id.add_button);
        subButton=(Button)findViewById(R.id.sub_button);
        mulButton=(Button)findViewById(R.id.mul_button);
        divButton=(Button)findViewById(R.id.div_button);
        num1=(EditText)findViewById(R.id.numText1);
        num2=(EditText)findViewById(R.id.numText2);
        result=(EditText)findViewById(R.id.numTextResult);
        addNumbers();
        subNumbers();
        mulNumbers();
        divNumbers();
    }

    public void addNumbers()
    {
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                String sum=Float.toString(a+b);
                result.setText(sum);

            }
        });
    }
    public void subNumbers()
    {
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                String sum=Float.toString(a-b);
                result.setText(sum);

            }
        });
    }
    public void mulNumbers(){
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                String prod=Float.toString(a*b);
                result.setText(prod);

            }
        });
    }
    public void divNumbers(){
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                String div=Float.toString(a/b);
                result.setText(div);

            }
        });
    }

}
