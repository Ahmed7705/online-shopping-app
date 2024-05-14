package com.example.onlineshopping;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        // Find TextViews
        TextView textViewBashaer = findViewById(R.id.textViewBashaer);
        TextView textViewFayzah = findViewById(R.id.textViewFayzah);
        TextView textViewOhoud = findViewById(R.id.textViewOhoud);
        TextView textViewAfaf = findViewById(R.id.textViewAfaf);

        // Set text with provided information
        textViewBashaer.setText("Bashaer Tahir 202209010");
        textViewFayzah.setText("Fayzah Ahmad 202204077");
        textViewOhoud.setText("Ohoud Yahya 202202762");
        textViewAfaf.setText("Afaf Ali 202204176");
    }
}
