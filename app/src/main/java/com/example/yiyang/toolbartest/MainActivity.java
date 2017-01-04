package com.example.yiyang.toolbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        final ToggleButton tbnHideShowToolbar = (ToggleButton) findViewById(R.id.tbnHideShowToolbar);
        tbnHideShowToolbar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (tbnHideShowToolbar.isChecked())
                    getSupportActionBar().hide();
                else
                    getSupportActionBar().show();
            }
        });
    }
}
