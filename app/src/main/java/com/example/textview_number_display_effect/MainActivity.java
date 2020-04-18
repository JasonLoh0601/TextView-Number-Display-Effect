package com.example.textview_number_display_effect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.textview_number_display_effect.MainController.NumberRunningTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example to show the number effect.
        final NumberRunningTextView test = findViewById(R.id.test);
        // set new value into the NumberRunningTextView
        test.setContent("1500.36");
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // set new value into the NumberRunningTextView
                test.setContent("234444500.36");
            }
        });
    }
}
