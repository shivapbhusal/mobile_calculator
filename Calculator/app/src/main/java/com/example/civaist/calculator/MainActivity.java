package com.example.civaist.calculator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button addButton;
    public Button subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = (Button) findViewById(R.id.btn_add);
        subButton = (Button) findViewById(R.id.btn_sub);
        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_add:
                Toast.makeText(MainActivity.this, "button1", Toast.LENGTH_LONG).show();
                break;
        }

    }

}
