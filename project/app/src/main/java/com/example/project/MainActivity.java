package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton exitb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitb = (ImageButton) findViewById(R.id.exitb);
exitb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"click long press to exit please",Toast.LENGTH_SHORT).show();
    }
});
exitb.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        finish();
        return true;
    }
});
    }

    public void about(View view) {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText("What is glow up helper?\n" +
                "We made this app to help you glow up in a easy and healthy way , by pointing to small details about yourself to reach the Best version of yourself");
    }

    public void secpage(View view) {
        Intent i;
        i = new Intent(this,Activity_info.class);
        startActivity(i);
    }



}