package com.example.sandeep.glidetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image);

        String imageUrl="https://img.youtube.com/vi/twZggnNbFqo/maxresdefault.jpg";

        Glide.with(this).load(imageUrl).into(imageView);

    }
}
