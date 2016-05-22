package com.example.android.popularmoviez;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Suj🌠 on 10-05-2016.
 */
public class myPreferenceActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.settings_preference);
        getFragmentManager().beginTransaction().replace(android.R.id.content,new myPreferenceFragment()).commit();
    }
}
