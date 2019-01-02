package com.example.user.museummusik;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button map;
    private Button myButton;
    private Button myButton2;
    private Button myButton3;
    private Button myButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mp = (Button) findViewById(R.id.map);
        myButton = (Button) findViewById(R.id.desk);
        myButton2 = (Button) findViewById(R.id.fasil);
        myButton3 = (Button) findViewById(R.id.gale);
        myButton4 = (Button) findViewById(R.id.camera);


        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.google.com/maps/place/Museum+Musik+Indonesia,+Jalan+Nusakambangan+No.19,+Kasin,+Klojen,+Kasin,+Klojen,+Kota+Malang,+Jawa+Timur+65117/@-7.9883294,112.6266462,17z/data=!4m2!3m1!1s0x2dd6281bed7593e9:0x30c23d27c745c79a?hl=id"));
                startActivity(i);
            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Deskripsi.class);
                startActivity(i);
            }
        });

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Fasilitas.class);
                startActivity(i);
            }
        });

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Galeri.class);
                startActivity(i);
            }
        });

        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Camera.class);
                startActivity(i);
            }
        });

//        Button map = (Button) findViewById(R.id.map);
//        Button.setOnClickListener( new onCreatePanelView().hasOnClickListeners() {
//                Intent i = new Intent();
//        i.setAction(Intent.ACTION_VIEW);
//        i.addCategory(Intent.CATEGORY_BROWSABLE);
//        i.setData(Uri.parse("https://maps.google.com/"));
//        startActivity(i);
//        });
    }
}
