import java.util.ArrayList;



public class CD {
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
    private int id;
    private String title;
    private String[] artists;
    private String category;
    private double cost;
    private ArrayList<Track> tracks;
    private int length;

    public CD(int id, String title, String[] artists, String category, double cost) {
        this.id = id;
        this.title = title;
        this.artists = artists;
        this.category = category;
        this.cost = cost;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(Track track) {
        if(!this.tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track already exists in the CD");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.length;
        }
        this.length = totalLength;
        return this.length;
    }


    public void play() {
        System.out.println("Playing CD: " + this.title);
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
}