package com.example.civaist.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button addButton;
    public Button subButton;
    public TextView textInput;
    public TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = (Button) findViewById(R.id.btn_add);
        subButton = (Button) findViewById(R.id.btn_sub);
        textInput=(TextView) findViewById(R.id.edit_input);
        textOutput=(TextView) findViewById(R.id.edit_output);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_add:
                textInput.setText("+");
                break;
            case R.id.btn_sub:
                textInput.setText("-");
        }

    }

}
