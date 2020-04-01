package com.example.uts_new.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uts_new.R;
import com.squareup.picasso.Picasso;

public class PlayMusicActivity extends AppCompatActivity {

    TextView judul, album;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        if (getIntent().hasExtra("judul-key") &&
            getIntent().hasExtra("album-key") &&
            getIntent().hasExtra("foto-key")) {

            String text_judul = getIntent().getStringExtra("judul-key");
            String text_album = getIntent().getStringExtra("album-key");
            String foto_album = getIntent().getStringExtra("foto-key");

            setContent(text_judul, text_album, foto_album);
        }
    }

    private void setContent(String textJudul, String textAlbum, String fotoAlbum) {
        judul = findViewById(R.id.textView_hasilJudul);
        album = findViewById(R.id.textView_hasilAlbum);
        foto = findViewById(R.id.imageView_hasilAlbum);

        judul.setText(textJudul);
        album.setText(textAlbum);
        Picasso.get().load(fotoAlbum).into(foto);
    }
}
