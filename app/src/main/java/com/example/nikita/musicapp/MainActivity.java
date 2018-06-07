package com.example.nikita.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.nikita.musicapp.R;
import com.example.nikita.musicapp.favorites.FavoritesActivity;
import com.example.nikita.musicapp.searchalbum.SearchAlbumActivity;
import com.example.nikita.musicapp.topsongs.TopSongsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bTopSongs = findViewById(R.id.bTopSongs);
        bTopSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TopSongsActivity.class);
                startActivity(intent);
            }
        });

        Button bFavorites = findViewById(R.id.bFavorites);
        bFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });

        Button bSearchAlbum = findViewById(R.id.bSearchAlbum);
        bSearchAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchAlbumActivity.class);
                startActivity(intent);
            }
        });
    }
}
