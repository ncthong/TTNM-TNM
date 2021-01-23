package com.utt.tnm;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.utt.ttnm.R;
import com.utt.fragments.AccountFragment;
import com.utt.fragments.HomeFragment;
import com.utt.fragments.OrderFragment;
import com.utt.fragments.StoreFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    ImageButton imbtnHome, imbtnOrder, imbtnShop, imbtnAccount;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imbtnHome = (ImageButton) findViewById(R.id.imbtnHome);
        imbtnOrder = (ImageButton) findViewById(R.id.imbtnOrder);
        imbtnShop = (ImageButton) findViewById(R.id.imbtnShop);
        imbtnAccount = (ImageButton) findViewById(R.id.imbtnAccount);
        imbtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new HomeFragment();
            }
        });

        imbtnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new OrderFragment();
            }
        });

        imbtnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new StoreFragment();
            }
        });

        imbtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new AccountFragment();
            }
        });
    }



}