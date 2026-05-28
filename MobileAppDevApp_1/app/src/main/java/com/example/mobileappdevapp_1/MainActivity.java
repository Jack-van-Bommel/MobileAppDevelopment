package com.example.mobileappdevapp_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToSite(View view) {
        Intent browserIntent = new Intent("android.intent.action.VIEW"
                                        , Uri.parse("https://www.speedtest.net/nl"));
        startActivity(browserIntent);
    }

    public void page_2(View view) {
        Intent pageIntent = new Intent()
    }
}