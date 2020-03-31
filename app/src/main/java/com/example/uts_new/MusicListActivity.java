package com.example.uts_new;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uts_new.adapter.MusicAdapter;
import com.example.uts_new.model.DataMusic;

import java.util.ArrayList;
import java.util.List;

public class MusicListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        RecyclerView recyclerView = findViewById(R.id.rv_music);

        List<DataMusic> musics = new ArrayList<>();

        musics.add(new DataMusic("Sebelum Kau Bosan", "Antara Aku Kau Dan Bekas Pacarmu",
                "https://upload.wikimedia.org/wikipedia/id/d/d6/Fals_antara_aku.jpg"));
        musics.add(new DataMusic("Yang Tersendiri", "Antara Aku Kau Dan Bekas Pacarmu",
                "https://upload.wikimedia.org/wikipedia/id/d/d6/Fals_antara_aku.jpg"));
        musics.add(new DataMusic("Iya atau Tidak", "Belum Ada Judul",
                "https://upload.wikimedia.org/wikipedia/id/thumb/7/79/22_BAJcopy-.jpg/220px-22_BAJcopy-.jpg"));
        musics.add(new DataMusic("Di Mata Air Tidak Ada Air Mata", "Belum Ada Judul",
                "https://upload.wikimedia.org/wikipedia/id/thumb/7/79/22_BAJcopy-.jpg/220px-22_BAJcopy-.jpg"));
        musics.add(new DataMusic("Panggilan dari Gunung", "Belum Ada Judul",
                "https://upload.wikimedia.org/wikipedia/id/thumb/7/79/22_BAJcopy-.jpg/220px-22_BAJcopy-.jpg"));
        musics.add(new DataMusic("Buku Ini Aku Pinjam", "Kemesraan",
                "https://upload.wikimedia.org/wikipedia/id/thumb/4/4a/Kemesraan.jpg/220px-Kemesraan.jpg"));
        musics.add(new DataMusic("Kemesraan", "Kemesraan",
                "https://upload.wikimedia.org/wikipedia/id/thumb/4/4a/Kemesraan.jpg/220px-Kemesraan.jpg"));
        musics.add(new DataMusic("Nona", "Mata Dewa",
                "https://upload.wikimedia.org/wikipedia/id/thumb/c/c3/17_MataDewacopy-.jpg/220px-17_MataDewacopy-.jpg"));
        musics.add(new DataMusic("Air Mata Api", "Mata Dewa",
                "https://upload.wikimedia.org/wikipedia/id/thumb/c/c3/17_MataDewacopy-.jpg/220px-17_MataDewacopy-.jpg"));
        musics.add(new DataMusic("Perempuan Malam", "Mata Dewa",
                "https://upload.wikimedia.org/wikipedia/id/thumb/c/c3/17_MataDewacopy-.jpg/220px-17_MataDewacopy-.jpg"));

        MusicAdapter adapter = new MusicAdapter(this, musics);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
