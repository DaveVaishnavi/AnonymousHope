package com.example.anonymous_hope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.anonymous_hope.databinding.ActivityMainBinding;

public class RaiseFundActivity extends AppCompatActivity {
    Toolbar toolbar;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raise_fund);
        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        ImageView btn1 = (ImageView) findViewById(R.id.img1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, MedicalFormActivity.class));
            }
        });
        ImageView btn2 = (ImageView) findViewById(R.id.img2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, CalamityFormActivity.class));
            }
        });
        ImageView btn3 = (ImageView) findViewById(R.id.img3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, EducationFormActivity.class));
            }
        });
        ImageView btn4 = (ImageView) findViewById(R.id.img4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, OrphanageFormActivity.class));
            }
        });
        ImageView btn5 = (ImageView) findViewById(R.id.img5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, OldAgeFormActivity.class));
            }
        });
        ImageView btn6 = (ImageView) findViewById(R.id.img6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, AnimalFormActivity.class));
            }
        });
        ImageView btn7 = (ImageView) findViewById(R.id.img7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, NatureFormActivity.class));
            }
        });
        ImageView btn8 = (ImageView) findViewById(R.id.img8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RaiseFundActivity.this, OtherFormActivity.class));
            }
        });
    }
}