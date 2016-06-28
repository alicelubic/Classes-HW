import java.util.*;

/**
 * Created by owlslubic on 6/27/16.
 */
public class User {
    String mName;
    HashMap mPlaylists;

    public void user(String name,HashMap playlists){
        mName = name;
        Map<String, Playlist> mPlaylists = new HashMap<>();
    }

    public void addPlayList(Playlist playlist){
        mPlaylists.put(playlist.getName(), playlist);
    }
    public List<String> getAllPlaylistNames(){
        List<String> playlistNames = new ArrayList<>();
        for (String key: mPlaylists.keySet()){ //it is telling me that I need an object and not a String to work this for loop
                                                //but I don't understand how to do that, or why the object String isn't satisfying that requirement
            playlistNames.add(key);
        }
        return playlistNames;

       }

    public Playlist getPlaylistByName(String name){

        if(mPlaylists.containsKey(name)){
            return mPlaylists.get(name); //same problem with it needing an object here
        }
        else{
            return null;
        }


    }



}
