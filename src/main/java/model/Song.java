package model;

import org.springframework.web.multipart.MultipartFile;

public class Song {
    private String songName;
    private String songSinger;
    private String type;
    private MultipartFile source;

    public Song() {
    }

    public Song(String songName, String songSinger, String type, MultipartFile source) {
        this.songName = songName;
        this.songSinger = songSinger;
        this.type = type;
        this.source = source;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MultipartFile getSource() {
        return source;
    }

    public void setSource(MultipartFile source) {
        this.source = source;
    }
}
