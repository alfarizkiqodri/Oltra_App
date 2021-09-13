package com.example.oltra_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OltraStartPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oltra_start_page);

        button = (Button) findViewById(R.id.regbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegistPage();
            }
        });
    }
    public void openRegistPage(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}