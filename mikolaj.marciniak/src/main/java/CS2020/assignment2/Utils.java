package CS2020.assignment2;

import java.util.*;

import javax.swing.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static HashMap<UUID, String> returnSongDurationAndTitleFormatted(ArrayList<Song> songList) {
        HashMap<UUID, String> map=new HashMap<UUID,String>();
        songList.forEach((song) -> { 
            Integer minutes = song.getDuration()/60;
            Integer seconds = song.getDuration()%60;
            String time = minutes.toString() + ":" + seconds.toString();
            String titleString = song.getTitle() + " " + "(" + time + ")";
            map.put(song.getSongID(), titleString);
        });
        
        return map;
    }

    public Boolean checkIfBornOnWeekend(String dob){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
        LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
        String day = dateOfBirth.getDayOfWeek().toString();
        if (day == "SATURDAY" || day == "SUNDAY") {
            return true;
        }
        return false;
    }
    
    public static void createExampleArtists(JList<Artist> list){
        //3.2 Amend your createExampleArtists() method so it takes an input parameter of JList list. JList is
        //a raw type so you should also set the appropriate type attribute using the <>. 
        Artist eltonJohn = new Artist();
        //JList.add(eltonJohn);
        eltonJohn.setFirstName("Elton");
        eltonJohn.setLastName("John*");
        eltonJohn.setDOB("25 Mar 1947");
        eltonJohn.setPlaceOfBirth("United Kingdom");
        Song rocketMan = new Song();
        rocketMan.setArtistID(eltonJohn.getArtistID());
        rocketMan.setTitle("Rocket Man");
        rocketMan.setDuration(281);
        Song honkyCat = new Song();
        honkyCat.setArtistID(eltonJohn.getArtistID());
        honkyCat.setTitle("Honky Cat");
        honkyCat.setDuration(313);

        Artist kendrickLamar = new Artist();
        kendrickLamar.setFirstName("Kendrick");
        kendrickLamar.setLastName("Lamar*");
        kendrickLamar.setDOB("17 Jun 1987");
        kendrickLamar.setPlaceOfBirth("California");
        Song theRecipe = new Song();
        theRecipe.setArtistID(kendrickLamar.getArtistID());
        theRecipe.setTitle("The Recipe");
        theRecipe.setDuration(353);
        Song blackFriday = new Song();
        blackFriday.setArtistID(kendrickLamar.getArtistID());
        blackFriday.setTitle("Black Friday");
        blackFriday.setDuration(428);

    }

    public void connectToDatabase (){

    }

    public void readArtistAndSongsFromDatabase(JList list) {

    }
}
