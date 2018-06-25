package com.happytrees.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.TV) TextView myTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);// before using any the views, call bind on the ButterKnife object.


        myTV.setText("butter Text");
    }

    //Button
    @OnClick(R.id.Btn)
    public void customMethodName () {
        Toast.makeText(MainActivity.this, "Button Butter", Toast.LENGTH_SHORT).show();
    }
}
