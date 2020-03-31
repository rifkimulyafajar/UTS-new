package com.example.uts_new.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_new.R;
import com.example.uts_new.model.DataMusic;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {
    private Context context;
    private List<DataMusic> dataMusics;

    public MusicAdapter(Context context, List<DataMusic> dataMusics) {
        this.context = context;
        this.dataMusics = dataMusics;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_music, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataMusic music = dataMusics.get(position);

        Picasso.get().load(music.getFotoAlbum()).into(holder.image_album);
        holder.text_judul.setText(music.getJudul());
        holder.text_album.setText(music.getAlbum());
    }

    @Override
    public int getItemCount() {
        return (dataMusics != null) ? dataMusics.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_judul, text_album;
        ImageView image_album;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_judul = itemView.findViewById(R.id.textView_judul);
            text_album = itemView.findViewById(R.id.textView_album);
            image_album = itemView.findViewById(R.id.image_album);
        }
    }
}
