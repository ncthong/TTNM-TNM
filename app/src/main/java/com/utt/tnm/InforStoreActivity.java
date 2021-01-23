package com.utt.tnm;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.utt.ttnm.R;

import androidx.appcompat.app.AppCompatActivity;


public class InforStoreActivity extends AppCompatActivity {

    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_store);

        imgBack = (ImageView) findViewById(R.id.imgBackToHome);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
