package com.example.nikita.musicapp.favorites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;
import com.example.nikita.musicapp.R;
import com.example.nikita.musicapp.database.Favorite;

public class FavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Realm realm = Realm.getDefaultInstance();

        RealmResults<Favorite> favorites = realm
                .where(Favorite.class)
                .sort("date", Sort.DESCENDING)
                .findAll();

        if (favorites.size() > 0 ) {
            Toast. makeText ( this , "Pobrano ulubione" , Toast. LENGTH_SHORT ).show();
            for (Favorite favorite : favorites) {
                Log. d ( "FAV" , favorite.getArtist() + " - " + favorite.getTrack());
            }
        } else {
            Toast. makeText ( this , "Brak ulubionych" , Toast. LENGTH_SHORT ).show();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();

        return true;
    }
}
