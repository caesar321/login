package com.example.logindetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        TextView textView= findViewById(R.id.txtView);
        EditText editText= findViewById(R.id.editTextTextEmailAddress);
        EditText editText1= findViewById(R.id.editTextTextPersonName);
        EditText editText2= findViewById(R.id.editText);
        textView.setText(editText.getText().toString());
        textView.setText(editText2.getText().toString());
        textView.setText(editText1.getText().toString());
    }
}