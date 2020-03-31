package com.example.uts_new.model;

public class DataMusic {
    String judul, album, fotoAlbum;

    public DataMusic(String judul, String album, String fotoAlbum) {
        this.judul = judul;
        this.album = album;
        this.fotoAlbum = fotoAlbum;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getFotoAlbum() {
        return fotoAlbum;
    }

    public void setFotoAlbum(String fotoAlbum) {
        this.fotoAlbum = fotoAlbum;
    }
}
