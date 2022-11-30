package sample2;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    private String name;

    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album){
        this.albums.add(album);
    }

    public String getName() {
        return name;
    }
}
