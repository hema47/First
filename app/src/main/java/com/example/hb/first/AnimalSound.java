package com.example.hb.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalSound extends AppCompatActivity {
    Button dogBtn,catBtn,contextBtn;
    TextView soundText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sound);
        dogBtn = (Button)findViewById(R.id.dog_btn);
        catBtn = (Button)findViewById(R.id.cat_btn);
        soundText=(TextView)findViewById(R.id.sound_text);
        contextBtn=(Button) findViewById(R.id.context_);

        final Animals a=new Animals();

        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundText.setText(a.dogbark.toString()+a.cat.toString());


            }
        });

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundText.setText(a.cat().toString());
            }
        });

        Toast.makeText(AnimalSound.this,Animals.hema(),Toast.LENGTH_SHORT).show();

        contextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.print(AnimalSound.this);
            }
        });

    }
}
