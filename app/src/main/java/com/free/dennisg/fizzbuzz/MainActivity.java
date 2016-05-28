package com.free.dennisg.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TextView consoleOutTextView = (TextView) findViewById(R.id.textView);
        final TextView fizzBuzzOutput = (TextView) findViewById(R.id.textView2);
        final EditText fizzBuzzEditText = (EditText) findViewById(R.id.editText);
        final Button fizzBuzzButton = (Button) findViewById(R.id.button);

        assert fizzBuzzButton != null;
        fizzBuzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fizzBuzzNumber;
                if (fizzBuzzEditText.getText().length() > 0) {
                    fizzBuzzNumber = Double.valueOf(fizzBuzzEditText.getText().toString());
                }else{
                    fizzBuzzNumber = 0;
                }

                String fizzBuzzText = "";

                if (fizzBuzzNumber % 3 == 0){
                    fizzBuzzText += "Fizz";
                }
                if (fizzBuzzNumber % 5 == 0){
                    fizzBuzzText += (fizzBuzzText != "" ? "" : "") + "Buzz";
                }

                if(fizzBuzzNumber % 5 != 0 && fizzBuzzNumber % 3 != 0){
                    //fizzBuzzText += String.valueOf(fizzBuzzNumber);
                    fizzBuzzText += "Neither";
                }

                assert fizzBuzzOutput != null;
                fizzBuzzOutput.setText(fizzBuzzText);

            }
        });


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
