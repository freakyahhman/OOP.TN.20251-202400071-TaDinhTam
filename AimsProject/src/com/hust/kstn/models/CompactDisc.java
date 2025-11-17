import java.util.ArrayList;
package com.hust.kstn.models;


public class CompactDisc extends Disc {
    public static class Track {
        private String title;
        private int length;

        public Track(String title, int length) {
            this.title = title;
            this.length = length;
        }

        public void play() {
            System.out.println("Playing track: " + this.title + " - Length: " + this.length);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Track track = (Track) obj;
            return title.equals(track.title); 
        }
    }
    private String[] artists;
    private ArrayList<Track> tracks;
    private int length;

    public CompactDisc(String title, String category, double cost, String[] artists, ArrayList<Track> tracks) {
        super(title, category, cost);
        this.artists = artists;
        this.tracks = tracks;
        this.length = 0;
    }

    public void addTrack(Track track) {
        if(!this.tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track already exists in the CD");
        }
    }

    public void removeTrack(Track track) {
        if(this.tracks.contains(track)) {
            this.tracks.remove(track);
        } else {
            System.out.println("Track not found in the CD");
        }
    }

    public int totalLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.length;
        }
        this.length = totalLength;
        return this.length;
    }


    public void play() {
        System.out.println("Playing CD: " + getTitle());
        for (Track track : tracks) {
            if (track == null) {
                System.out.println("Error: CD has no tracks to play");
                return;
            }
            if(track.length <= 0) {
                System.out.println("Error: Track " + track.title + " has non-positive length");
                return;
            }
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CD [" + getID() + "] - [" + getTitle() + "] - [" + getCategory() + "] - [" + getCost() + "] - [" + this.length + "]";
    }
}