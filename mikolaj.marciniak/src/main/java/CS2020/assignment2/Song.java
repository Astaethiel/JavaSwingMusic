package CS2020.assignment2;

import java.util.*;

public class Song {
    private UUID songID;
    private UUID artistID;
    private String title;
    private Integer duration;

    public UUID getSongID(){
        return songID; 
    }
    public UUID getArtistID(){
        return artistID; 
    }
    public String getTitle(){
        return title;
    }
    public Integer getDuration(){
        return duration;
    }
   
   
   
   
    public void setSongID(UUID ID){
        songID = ID; 
    }
    public void setArtistID(UUID ID){
        artistID = ID; 
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setDuration(Integer newDuration){
        duration = newDuration;
    }
}
