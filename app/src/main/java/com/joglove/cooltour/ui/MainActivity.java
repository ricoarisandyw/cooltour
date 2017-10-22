package com.joglove.cooltour.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.joglove.cooltour.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnNearByMe, btnFindByLocation, btnSetting, btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNearByMe = (LinearLayout) findViewById(R.id.btnNearByMe);
        btnFindByLocation = (LinearLayout) findViewById(R.id.btnFindByLocation);
        btnSetting = (LinearLayout) findViewById(R.id.btnSetting);
        btnAboutUs = (LinearLayout) findViewById(R.id.btnAboutUs);

        btnNearByMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MapActivity.class);
                startActivity(i);
            }
        });

        btnFindByLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View checkBoxView = View.inflate(MainActivity.this, R.layout.modal_list_city, null);
                final Dialog popup = new Dialog(MainActivity.this);
                popup.setContentView(checkBoxView);
//                popup.setTitle("Select Filter");
                popup.setCanceledOnTouchOutside(true);
                popup.show();
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });

        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, );
//                startActivity(i);
            }
        });

    }
}
