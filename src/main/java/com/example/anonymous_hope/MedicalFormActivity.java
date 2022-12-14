package com.example.anonymous_hope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.anonymous_hope.databinding.ActivityMainBinding;

public class MedicalFormActivity extends AppCompatActivity {
    Toolbar toolbar;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_form);
        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
    }
}
