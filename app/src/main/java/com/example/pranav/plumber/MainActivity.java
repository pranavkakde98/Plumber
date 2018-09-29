package com.example.pranav.plumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    private void p2() {
        Intent intent=new Intent(this,Plumber2.class);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
            p2();

    }
}
