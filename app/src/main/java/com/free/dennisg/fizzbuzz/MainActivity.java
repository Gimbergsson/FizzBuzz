package com.free.dennisg.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TextView consoleOutTextView = (TextView) findViewById(R.id.textView);

        String text = "";

        for (int i = 1; i <= 100; i++ ){

            text += "\n";

            if (i % 3 == 0){
                text += "Fizz";
            }
            if (i % 5 == 0){
                text += (text != "" ? "" : "") + "Buzz";
            }

            if(i % 5 != 0 && i % 3 != 0){
                text += String.valueOf(i);
            }

            if (consoleOutTextView != null) {
                consoleOutTextView.setText(text);
            }
        }
    }
}
