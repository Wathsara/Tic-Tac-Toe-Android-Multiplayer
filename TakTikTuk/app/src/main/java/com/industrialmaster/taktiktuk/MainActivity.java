package com.industrialmaster.taktiktuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newGame(View v){
        Intent intent = new Intent(this , newgame.class);
        startActivity(intent);
    }

    public void instruction(View v){
        Intent intent = new Intent(this,instruction.class);
        startActivity(intent);
    }
}
