package com.example.incrementdecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ibtn;
    Button dbtn;
    TextView display;
    int counter;
    int iclicknumber;
    TextView incnumber;
    TextView decnumber;
    int dclicknumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtn=findViewById(R.id.inbtn);
        dbtn=findViewById(R.id.decbtn);
        display=findViewById(R.id.result);
        incnumber=findViewById(R.id.inclicknumber);
        decnumber=findViewById(R.id.decclicknumber);


        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                display.setText(Integer.toString(counter));
                iclicknumber++;
                incnumber.setText(Integer.toString(iclicknumber));

            }
        });
        dbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                display.setText(Integer.toString(counter));
                dclicknumber++;
                decnumber.setText(Integer.toString(dclicknumber));
            }
        });
    }
}