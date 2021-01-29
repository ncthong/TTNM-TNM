package com.utt.tnm;

import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.utt.fragments.AccountFragment;
import com.utt.fragments.CartFragment;
import com.utt.fragments.HomeFragment;
import com.utt.fragments.NoneAccountFragment;
import com.utt.fragments.OrderFragment;
import com.utt.fragments.StoreFragment;
import com.utt.fragments.fragment_lab.ComcomFragment;
import com.utt.fragments.fragment_lab.DrinkFragment;
import com.utt.fragments.fragment_lab.FoodFragment;
import com.utt.ttnm.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener, OrderFragment.OnFragmentInteractionListener, StoreFragment.OnFragmentInteractionListener, AccountFragment.OnFragmentInteractionListener,
        ComcomFragment.OnFragmentInteractionListener, DrinkFragment.OnFragmentInteractionListener, FoodFragment.OnFragmentInteractionListener {

    Fragment fragment = null;
    ImageView imgNewsLayout, imgCartLayout, imgStoreLayout, imgAccountLayout, imgOrderLayout;
    private String TAG = "HomeActivity";
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initLayout();
        // Begin the transaction
        ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_container, new HomeFragment());
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Complete the changes added above
        ft.commit();
        fragment = new HomeFragment();


    }

    private void initLayout() {
        imgNewsLayout = (ImageView) findViewById(R.id.imgNewsLayout);
        imgCartLayout = (ImageView) findViewById(R.id.imgCartLayout);
        imgStoreLayout = (ImageView) findViewById(R.id.imgStoreLayout);
        imgAccountLayout = (ImageView) findViewById(R.id.imgAccountLayout);
        imgOrderLayout = (ImageView) findViewById(R.id.imgOrderLayout);

        imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                PorterDuff.Mode.MULTIPLY);
        imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                PorterDuff.Mode.MULTIPLY);
        imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                PorterDuff.Mode.MULTIPLY);
        imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                PorterDuff.Mode.MULTIPLY);
        imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                PorterDuff.Mode.MULTIPLY);

        imgNewsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                        PorterDuff.Mode.MULTIPLY);
                imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                loadFragment(new HomeFragment());
                Log.d(TAG, "news fragment");


            }
        });
        imgCartLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                        PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                loadFragment(new OrderFragment());
                Log.d(TAG, "order fragment");

            }
        });
        imgStoreLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                        PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                loadFragment( new StoreFragment());
                Log.d(TAG, "store fragment");

            }
        });
        imgAccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                        PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                    loadFragment(new NoneAccountFragment());
                Log.d(TAG, "none account fragment");

            }
        });
        imgOrderLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgNewsLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgCartLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgStoreLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgAccountLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_4),
                        PorterDuff.Mode.MULTIPLY);
                imgOrderLayout.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.color_basic_1),
                        PorterDuff.Mode.MULTIPLY);
                loadFragment(new CartFragment());
                Log.d(TAG, "cart fragment");
            }
        });
    }


    private void loadFragment(Fragment fragment) {
        // create a FragmentManager
        ft = getSupportFragmentManager().beginTransaction();
        // replace the FrameLayout with new Fragment
        ft.replace(R.id.fragment_container, fragment);
        ft.commit(); // save the changes
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
