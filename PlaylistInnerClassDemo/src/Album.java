import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;


    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle())==null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong (String title) {
            for (Song s:this.songs) {
                if (s.getTitle().equals(title)){
                    return s;
                }
            }
            return null;
        }

        private Song findSong (int trackNumber) {
            int index = trackNumber-1;
            if (0>=index && index<songs.size()){
                return songs.get(index);
            }
            return null;
        }

    }


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong (String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index= trackNumber-1;
        if (index>=0 && index< songs.songs.size()){
            playList.add(songs.songs.get(index));
            return true;
        }
        //System.out.println("This album does not have a track number "+trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song s = songs.findSong(title);
        if (s!=null){
            playList.add(s);
            return true;
        }
        //System.out.println("This album does not have the track "+title);
        return false;
    }
}
