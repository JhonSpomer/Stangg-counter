package com.example.stangg_life_counter;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int life = 40;
    int stangg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IncreaseLife(View view) {
        TextView text = (TextView) findViewById(R.id.LifeTotal);
        life++;
        text.setText(""+life+"");
    }

    public void IncreaseStangg(View view) {
        TextView text = (TextView) findViewById(R.id.TotalStangg);
        stangg++;
        text.setText(""+stangg+"");
    }

    public void ResetStats(View view) {
        TextView lifeView = (TextView) findViewById(R.id.LifeTotal);
        TextView text = (TextView) findViewById(R.id.TotalStangg);
        life = 40;
        stangg = 0;
        text.setText(""+stangg+"");
        lifeView.setText(""+life+"");
    }

    public void DecreaseLife(View view) {
        TextView lifeView = (TextView) findViewById(R.id.LifeTotal);
        life--;
        lifeView.setText(""+life+"");
    }


}
