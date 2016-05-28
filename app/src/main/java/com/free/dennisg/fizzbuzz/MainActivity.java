package com.free.dennisg.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        for (int i = 1; i <= 100; i++ ){
            String text = "";

            if (i % 3 == 0){
                text += "Fizz";
            }
            if (i % 5 == 0){
                text += (text != "" ? "" : "") + "Buzz";
            }

            if(text == ""){
                text += String.valueOf(i);
            }

            System.out.println(text);
        }
    }
}
