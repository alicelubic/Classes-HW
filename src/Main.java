/**
 * Created by owlslubic on 6/27/16.
 */
public class Main {

    public static void main(String[] args){
        User user = new User();

        Song song1 = new Song("song1", "artist1", "album1");
        Song song2 = new Song("song2", "artist2", "album2");
        Song song3 = new Song("song3", "artist3", "album3");
        Song song4 = new Song("song4", "aritst4", "album4");
        Song song5 = new Song("song5", "artist5", "album5");

        Playlist playlist1 = new Playlist("Playlist1");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        playlist1.addSong(song4);
        playlist1.addSong(song5);


        Playlist playlist2 = new Playlist("Playlist2");
        playlist2.addSong(song1);
        playlist2.addSong(song2);
        playlist2.addSong(song3);

        user.addPlayList(playlist1);
        user.addPlayList(playlist2);

        System.out.println("Playlists: " + user.getAllPlaylistNames());
        System.out.println("Now Playing: " + playlist1.getName());
        playlist1.playAll();



    }

}
