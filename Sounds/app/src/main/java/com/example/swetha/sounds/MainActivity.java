package com.example.swetha.sounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.swetha.sounds.R.drawable.cat;
import static com.example.swetha.sounds.R.drawable.elephant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    MediaPlayer mediaPlayer;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        b1 = (Button) findViewById(R.id.b1);
//        b2 = (Button)findViewById(R.id.b2);
        imageView = (ImageView) findViewById(R.id.image);

//        b1.setOnClickListener(this);
//        b2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(mediaPlayer!=null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        switch (v.getId()){
            case R.id.b1 :
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.elephant);
               // Toast.makeText(getApplicationContext(),"Elephant",Toast.LENGTH_SHORT).show();


                break;
            case R.id.b2 :
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dog_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.dog);
                break;
            case R.id.b3:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cat_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.cat);
                break;
            case R.id.b4:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.fox_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.fox);
                break;
            case R.id.b5:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.camal_sond);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.camal);
                break;
            case R.id.b6:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.chimpanzee_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.chimpanzee);
                break;
            case R.id.b7:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.tiger_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.tiger);
                break;
            case R.id.b8:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lion_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.lion);
                break;
            case R.id.b9:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.horse_blow);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.horse);
                break;
            case R.id.b10:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cow_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.cow);
                break;
            case R.id.b11:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.goat_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.goat);
                break;
            case R.id.b12:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.hen_sound);
                mediaPlayer.start();
                imageView.setImageResource(R.drawable.hen);
                break;

        }
    }
}
