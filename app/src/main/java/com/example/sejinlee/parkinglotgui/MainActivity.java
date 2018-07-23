package com.example.sejinlee.parkinglotgui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class MainActivity extends AppCompatActivity {
    Button car_1 , car_2, car_3, car_4, car_6, car_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         car_1 = (Button) findViewById(R.id.car_1);

         car_1.setOnClickListener(new View.OnClickListener()
         {

             public void onClick(View v)
             {
                  car_1.setBackgroundColor(Color.RED);
                  Toast.makeText(getApplicationContext(), "this is button 1", Toast.LENGTH_SHORT).show();
             }
         });
        car_2 = (Button) findViewById(R.id.car_2);

        car_2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                car_2.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "this is button 2", Toast.LENGTH_SHORT).show();

            }
        });
        car_3 = (Button) findViewById(R.id.car_3);

        car_3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                car_3.setBackgroundColor(Color.RED);

                Toast.makeText(getApplicationContext(), "this is button 3", Toast.LENGTH_SHORT).show();
            }
        });
        car_4 = (Button) findViewById(R.id.car_4);

        car_4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                car_4.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "this is button 4", Toast.LENGTH_SHORT).show();
            }
        });

        car_5 = (Button) findViewById(R.id.car_5);

        car_5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                car_5.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "this is button 5", Toast.LENGTH_SHORT).show();
            }
        });

        car_6 = (Button) findViewById(R.id.car_6);

        car_6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                car_6.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "this is button 6", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
