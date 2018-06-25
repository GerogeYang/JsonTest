package com.tcl.jsontest;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private final String fileName = "app.json";
    private Button change;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        change = findViewById(R.id.change);
        display = findViewById(R.id.display);
        final AssetManager assetManager = this.getAssets();

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jsonString = JsonReader.getJson(assetManager, fileName);
                User user = JsonReader.getJsonToUser(assetManager, fileName);
                display.setText(jsonString);
                if (user != null){
                    System.out.println("YJ===>2 user.id = " + user.getId() + ",user.name = " + user.getName() + ",user.address = " + user.getAddress());
                }
            }
        });
    }
}
