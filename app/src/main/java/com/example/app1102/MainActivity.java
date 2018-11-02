package com.example.app1102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String temp=getResources().getString(R.string.app_title);
        Log.i("Andy",temp);
    }

    public void Cal(View view) {
        EditText Height=(EditText)findViewById(R.id.et_BodyHeight);
        EditText Weight=(EditText)findViewById(R.id.et_BodyWeight);
        TextView BMI=(TextView)findViewById(R.id.tv_BMI);

        double bmi;
        double height=Double.parseDouble(Height.getText().toString());
        double weight=Double.parseDouble(Weight.getText().toString());

        bmi=(float)weight/Math.pow(height/100,2);
        //bmi=Math.rint((float)weight/Math.pow(height/100,2)*100)/100;

        DecimalFormat df=new DecimalFormat("#.00");
        bmi=Double.parseDouble(df.format(bmi));

        Log.i("BMI",String.valueOf(bmi));

        BMI.setText(String.valueOf(bmi));


    }

    public void NextPage(View view) {
        Intent intent =new Intent();
        intent.setClass(MainActivity.this,Main2Activity.class);
        startActivity(intent);
        finish();


    }
}
