package com.hust.kstn.test;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc.Track track1 = new CompactDisc.Track("Track 1", 300);
        CompactDisc.Track track2 = new CompactDisc.Track("Track 2", 250);
        String[] artists = {"Artist 1", "Artist 2"};
        CompactDisc cd = new CompactDisc(0, "Greatest Hits", artists, "Pop", 19.99);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track1);   

        System.out.println("CD ID: " + cd.getId());
        System.out.println("CD Title: " + cd.getTitle());
        System.out.println("CD Artists: ");
        for (String artist : cd.getArtists()) {
            System.out.println("- " + artist);
        }
        System.out.println("CD Category: " + cd.getCategory());
        System.out.println("CD Cost: $" + cd.getCost());
        System.out.println("Total CD Length: " + cd.totalLength() + " seconds");
        System.out.println(cd.toString());
    }
}
