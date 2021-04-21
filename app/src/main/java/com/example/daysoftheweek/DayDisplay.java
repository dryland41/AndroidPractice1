package com.example.daysoftheweek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DayDisplay extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_display);

        Bundle extras = getIntent().getExtras();
        String day = extras.getString("KEY");

        TextView tvDay = (TextView)findViewById(R.id.dayName);
        tvDay.setText(day);

    }
}