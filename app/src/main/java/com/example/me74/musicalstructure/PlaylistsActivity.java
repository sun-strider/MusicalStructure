package com.example.me74.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);


        // Find the View that shows the playlists category
        TextView playlist = (TextView) findViewById(R.id.playlist1);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when that View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist1Intent = new Intent(PlaylistsActivity.this, Playlist1Activity.class);
                startActivity(playlist1Intent);
            }
        });


    }
}
