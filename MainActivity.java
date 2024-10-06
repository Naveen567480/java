package com.example.trial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
CardView edu,computerengineering,commerce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edu=(CardView) findViewById(R.id.edu);
        commerce=(CardView) findViewById(R.id.commerce) ;
        computerengineering=(CardView) findViewById(R.id.computerengineering) ;
        computerengineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computer();
            }
        });
        commerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comm();
            }
        });
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                education();
            }
        });
    }

    private void education() {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.edu,null);
        final AlertDialog alter=new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alter.show();
        alter.setCanceledOnTouchOutside(false);
    }

    private void comm() {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.commerce,null);
        final AlertDialog alter=new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alter.show();
        alter.setCanceledOnTouchOutside(false);
    }

    private void computer() {
        LayoutInflater inflater=LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.computer_engineering,null);
        final AlertDialog alter=new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alter.show();
        alter.setCanceledOnTouchOutside(false);
    }
}