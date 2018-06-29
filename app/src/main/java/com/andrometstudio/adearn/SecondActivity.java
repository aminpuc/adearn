package com.andrometstudio.adearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class SecondActivity extends AppCompatActivity {

    private InterstitialAd intAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intAd = new InterstitialAd(this);
        intAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));

        AdRequest intAdRec = new AdRequest.Builder().build();
        intAd.loadAd(intAdRec);

        intAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                showInterstitial();
            }
        });

    }

    public void showInterstitial() {
        if (intAd.isLoaded()) {
            Toast.makeText(getApplicationContext(), "Interstitial ad is loaded!", Toast.LENGTH_SHORT).show();
            intAd.show();
        } else {
            Toast.makeText(getApplicationContext(), "Interstitial ad loading failed!", Toast.LENGTH_SHORT).show();
        }
    }
}
