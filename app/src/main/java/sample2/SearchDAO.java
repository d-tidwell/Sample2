package sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchDAO {

    public List<Song> searchAllSongsByArtist(String search, Map<Artist, Map<Album, List<Song>>> database) {
        List<Song> songs = new ArrayList<>();
        Map<Album, List<Song>> map = database.get(search);
        for (Album album : map.keySet()) {
            for (Song song : map.get(album)) {
                songs.add(song);
            }
        }
        return songs;

    }

    public List<Song> searchAlbumSongs(String search, Map<Artist, Map<Album, List<Song>>> database){
        for(Artist artist: database.keySet()){
            Map<Album, List<Song>> map = database.get(artist);
            for(Album album: map.keySet()){
                if(album.getName().equals(search)){
                    return map.get(album);
                }
            }
        }
        return null;
    }


}
