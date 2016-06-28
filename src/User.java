import java.util.*;

/**
 * Created by owlslubic on 6/27/16.
 */
public class User {
    String mName;
    HashMap<String, Playlist> mPlaylists;

    public void user(String name,HashMap playlists){
        mName = name;
        Map<String, Playlist> mPlaylists = new HashMap<>();
    }

    public void addPlayList(Playlist playlist){
        mPlaylists.put(playlist.getName(), playlist);
    }
    public List<String> getAllPlaylistNames(){
        List<String> playlistNames = new ArrayList<>();
        for (String key: mPlaylists.keySet()){

            playlistNames.add(key);
        }
        return playlistNames;

       }

    public Playlist getPlaylistByName(String name){

        if(mPlaylists.containsKey(name)){
            return mPlaylists.get(name);
        }
        else{
            return null;
        }


    }



}
