package com.apress.gerber.lgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickEvent();
    }
    public void onButtonClickEvent()
    {
        //this is not happening
        b1=(Button)findViewById(R.id.button);
        t1=(EditText) findViewById(R.id.editText);
        t2=(EditText)findViewById((R.id.editText2));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(t2.getText().toString())>1)
                {
                    Toast.makeText(MainActivity.this,t1.getText().toString()+" is Not a faccha",Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this,t1.getText().toString()+" is a faccha",Toast.LENGTH_LONG).show();

            }
        });




    }






}
