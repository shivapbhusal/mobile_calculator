package com.example.civaist.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String expression="";
    public Button addButton;
    public Button subButton;
    public Button prodButton;
    public Button zeroButton;
    public Button oneButton;
    public Button twoButton;
    public Button threeButton;
    public Button fourButton;
    public Button fiveButton;
    public Button sixButton;
    public Button sevenButton;
    public Button eightButton;
    public Button nineButton;
    public Button equalButton;
    public TextView textInput;
    public TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = (Button) findViewById(R.id.btn_add);
        subButton=(Button) findViewById(R.id.btn_sub);
        prodButton=(Button)findViewById(R.id.btn_product);
        equalButton=(Button)findViewById(R.id.btn_equal);
        zeroButton=(Button)findViewById(R.id.btn_zero);
        oneButton=(Button)findViewById(R.id.btn_one);
        twoButton=(Button)findViewById(R.id.btn_two);
        threeButton=(Button)findViewById(R.id.btn_three);
        fourButton=(Button)findViewById(R.id.btn_four);
        fiveButton=(Button)findViewById(R.id.btn_five);
        sixButton=(Button)findViewById(R.id.btn_six);
        sevenButton=(Button)findViewById(R.id.btn_seven);
        eightButton=(Button)findViewById(R.id.btn_eight);
        nineButton=(Button)findViewById(R.id.btn_nine);
        textInput=(TextView) findViewById(R.id.edit_input);
        textOutput=(TextView) findViewById(R.id.edit_output);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        prodButton.setOnClickListener(this);
        equalButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_add:
                expression=expression.concat("+");
                textInput.setText(expression);
                break;
            case R.id.btn_sub:
                expression=expression.concat("-");
                textInput.setText(expression);
                break;
            case R.id.btn_divide:
                expression=expression.concat("/");
                textInput.setText(expression);
                break;
            case R.id.btn_product:
                expression=expression.concat("*");
                textInput.setText(expression);
                break;
            case R.id.btn_zero:
                expression=expression.concat("0");
                textInput.setText(expression);
                break;
            case R.id.btn_one:
                expression=expression.concat("1");
                textInput.setText(expression);
                break;
            case R.id.btn_two:
                expression=expression.concat("2");
                textInput.setText(expression);
                break;
            case R.id.btn_three:
                expression=expression.concat("3");
                textInput.setText(expression);
                break;
            case R.id.btn_four:
                expression=expression.concat("4");
                textInput.setText(expression);
                break;
            case R.id.btn_five:
                expression=expression.concat("5");
                textInput.setText(expression);
                break;
            case R.id.btn_six:
                expression=expression.concat("6");
                textInput.setText(expression);
                break;
            case R.id.btn_seven:
                expression=expression.concat("7");
                textInput.setText(expression);
                break;
            case R.id.btn_eight:
                expression=expression.concat("8");
                textInput.setText(expression);
                break;
            case R.id.btn_nine:
                expression=expression.concat("9");
                textInput.setText(expression);
                break;
            case R.id.btn_equal:
                Evaluate myEvaluate=new Evaluate();
                float myresult=myEvaluate.evalExp(expression);
                String result = Float.toString(myresult);
                textOutput.setText(result);
                break;

        }

    }

}



