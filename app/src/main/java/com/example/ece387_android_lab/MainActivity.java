package com.example.ece387_android_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean is_mad = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button the_button = (Button) findViewById(R.id.button1);
        the_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "I said DON'T press me", Toast.LENGTH_SHORT).show();
                TextView text = (TextView)findViewById(R.id.text1);
                if (!is_mad) {
                    text.setText("I said DON'T press me");
                    the_button.setText("I'm Sorry");
                    is_mad = true;
                } else {
                    text.setText("It's ok, just don't do it again");
                    the_button.setText("Don't Press Me");
                    is_mad = false;
                }
            }
        });
    }
}