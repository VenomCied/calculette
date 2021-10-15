package com.ciedou.calculette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView tvRes;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    public void init(){
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        tvRes=findViewById(R.id.tvRes);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void plus(View v){
        int res=Integer.parseInt(editTextNumber.getText().toString())+Integer.parseInt(editTextNumber2.getText().toString());
        tvRes.setText(res+"");
    }

    public void moins(View v){
        int res=Integer.parseInt(editTextNumber.getText().toString())-Integer.parseInt(editTextNumber2.getText().toString());
        tvRes.setText(res+"");
    }

    public void mult(View v){
        int res=Integer.parseInt(editTextNumber.getText().toString())*Integer.parseInt(editTextNumber2.getText().toString());
        tvRes.setText(res+"");
    }

    public void div(View v){
        int res=Integer.parseInt(editTextNumber.getText().toString())/Integer.parseInt(editTextNumber2.getText().toString());
        tvRes.setText(res+"");
    }
}