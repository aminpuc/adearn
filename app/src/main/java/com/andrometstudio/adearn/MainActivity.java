package com.andrometstudio.adearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int timeCount = 0;
    TextView timeTxt;
    private AdView ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad1 = findViewById(R.id.adView1);
        AdRequest adReq1 = new AdRequest.Builder()
                .build();
        ad1.loadAd(adReq1);

        ad2 = findViewById(R.id.adView2);
        AdRequest adReq2 = new AdRequest.Builder()
                .build();
        ad2.loadAd(adReq2);

        ad3 = findViewById(R.id.adView3);
        AdRequest adReq3 = new AdRequest.Builder()
                .build();
        ad3.loadAd(adReq3);

        ad4 = findViewById(R.id.adView4);
        AdRequest adReq4 = new AdRequest.Builder()
                .build();
        ad4.loadAd(adReq4);

        ad5 = findViewById(R.id.adView5);
        AdRequest adReq5 = new AdRequest.Builder()
                .build();
        ad5.loadAd(adReq5);

        ad6 = findViewById(R.id.adView6);
        AdRequest adReq6 = new AdRequest.Builder()
                .build();
        ad6.loadAd(adReq6);

        ad7 = findViewById(R.id.adView7);
        AdRequest adReq7 = new AdRequest.Builder()
                .build();
        ad7.loadAd(adReq7);

        ad8 = findViewById(R.id.adView8);
        AdRequest adReq8 = new AdRequest.Builder()
                .build();
        ad8.loadAd(adReq8);

        timeTxt = findViewById(R.id.time);
        if (timeCount < 100) {
            timeCount++;
        }
        timeTxt.setText(Integer.toString(timeCount));

        Button btnInterstitialAd = findViewById(R.id.fullAd);
        btnInterstitialAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeTxt = findViewById(R.id.time);
                if (timeCount == 100) {
                    timeCount = 0;
                }
                timeTxt.setText(Integer.toString(timeCount));
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (count == 0) {
            Toast.makeText(getApplicationContext(), "Welcome to Ad Earn!", Toast.LENGTH_LONG).show();
            count = 1;
        }
    }

    @Override
    public void onPause() {
        if (ad1 != null) {
            ad1.pause();
        }
        if (ad2 != null) {
            ad2.pause();
        }
        if (ad3 != null) {
            ad3.pause();
        }
        if (ad4 != null) {
            ad4.pause();
        }
        if (ad5 != null) {
            ad5.pause();
        }
        if (ad6 != null) {
            ad6.pause();
        }
        if (ad7 != null) {
            ad7.pause();
        }
        if (ad8 != null) {
            ad8.pause();
        }

        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

        if (ad1 != null) {
            ad1.resume();
        }
        if (ad2 != null) {
            ad2.resume();
        }
        if (ad3 != null) {
            ad3.resume();
        }
        if (ad4 != null) {
            ad4.resume();
        }
        if (ad5 != null) {
            ad5.resume();
        }
        if (ad6 != null) {
            ad6.resume();
        }
        if (ad7 != null) {
            ad7.resume();
        }
        if (ad8 != null) {
            ad8.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (ad1 != null) {
            ad1.destroy();
        }
        if (ad2 != null) {
            ad2.destroy();
        }
        if (ad3 != null) {
            ad3.destroy();
        }
        if (ad4 != null) {
            ad4.destroy();
        }
        if (ad5 != null) {
            ad5.destroy();
        }
        if (ad6 != null) {
            ad6.destroy();
        }
        if (ad7 != null) {
            ad7.destroy();
        }
        if (ad8 != null) {
            ad8.destroy();
        }

        super.onDestroy();
    }
}
