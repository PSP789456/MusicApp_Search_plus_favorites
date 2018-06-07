package com.example.nikita.musicapp.database;

import java.util.Date;

import io.realm.RealmObject;



public class Favorite extends RealmObject {
    private String track;
    private String artist;
    private int trackId;
    private Date date;

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}