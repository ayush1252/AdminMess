package com.example.akc.adminimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView textv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textv= (TextView) findViewById(R.id.textv);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {
            String j = b.get("name").toString();
            textv.setText(j);
        }

    }
}
