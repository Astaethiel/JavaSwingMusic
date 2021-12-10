package CS2020.assignment2;

import java.util.*;

public class Artist {
    private UUID artistID;
    private String firstName;
    private String lastName;
    private String dob;
    private String placeOfBirth;
    private ArrayList<Song> songs = new ArrayList<Song>();

    Artist(){
       artistID = UUID.randomUUID();
       }

    public UUID getArtistID(){
        return artistID; 
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDOB(){
        return dob;
    }
    public String getPlaceOfBirth(){
        return placeOfBirth;
    }
    public ArrayList<Song> getSongs(){
        return songs;
    }
    


    public void setArtistID(UUID ID){
        artistID = ID; 
    }
    public void setFirstName(String fname){
        firstName = fname;
    }
    public void setLastName(String lname){
        lastName = lname;
    }
    public void setDOB(String DOB){
        dob = DOB;
    }
    public void setPlaceOfBirth(String place){
        placeOfBirth = place;
    }
    public void setSongs(ArrayList<Song> songList){
        songs = songList;
    }
    
}
