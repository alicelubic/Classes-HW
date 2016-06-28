/**
 * Created by owlslubic on 6/27/16.
 */
public class Song {
    //private modifier?
    static String mSongName;
    static String mArtistName;
    static String mAlbumName;

    public Song(String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public static void play(){
        System.out.println(mSongName + mArtistName + mAlbumName);
    }
}
