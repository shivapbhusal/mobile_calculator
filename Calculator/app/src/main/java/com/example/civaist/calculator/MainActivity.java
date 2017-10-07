package com.example.civaist.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button addButton;
    Button subButton;
    EditText num1;
    EditText num2;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton=(Button)findViewById(R.id.add_button);
        subButton=(Button)findViewById(R.id.sub_button);
        num1=(EditText)findViewById(R.id.numText1);
        num2=(EditText)findViewById(R.id.numText2);
        result=(EditText)findViewById(R.id.numTextResult);
        addNumbers();
        mulNumbers();
    }
    public void addNumbers()
    {
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                String sum=Integer.toString(a+b);
                result.setText(sum);

            }
        });
    }
    public void mulNumbers()
    {
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(num1.getText().toString());
                int b=Integer.parseInt(num2.getText().toString());
                String diff=Integer.toString(a-b);
                result.setText(diff);

            }
        });

    }
}
