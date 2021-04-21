package com.example.daysoftheweek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Sunday;
    private Button Monday;
    private Button Tuesday;
    private Button Wednesday;
    private Button Thursday;
    private Button Friday;
    private Button Saturday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sunday = findViewById(R.id.btnSunday);
        Sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Sunday");
                startActivity(i);
            }
        });
        Monday = findViewById(R.id.btnMonday);
        Monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Monday");
                startActivity(i);
            }
        });
        Tuesday = findViewById(R.id.btnTuesday);
        Tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Tuesday");
                startActivity(i);
            }
        });
        Wednesday = findViewById(R.id.btnWednesday);
        Wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Wednesday");
                startActivity(i);
            }
        });
        Thursday = findViewById(R.id.btnThursday);
        Thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Thursday");
                startActivity(i);
            }
        });
        Friday = findViewById(R.id.btnFriday);
        Friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Friday");
                startActivity(i);
            }
        });
        Saturday = findViewById(R.id.btnSaturday);
        Saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, DayDisplay.class);
                i.putExtra("KEY", "Saturday");
                startActivity(i);
            }
        });

    }
}