import java.util.ArrayList;
import java.util.List;

/**
 * Created by owlslubic on 6/27/16.
 */
public class Playlist {
    String mName;
    ArrayList mSongs;

    public Playlist(String name){
        mName = name;

        List<String> mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }
    public void addSong(Song song){
        mSongs.add(song);
    }
    public void playAll(){
        for (int i = 0; i < mSongs.size(); i++) {
            Song.play();
        }
    }

}
