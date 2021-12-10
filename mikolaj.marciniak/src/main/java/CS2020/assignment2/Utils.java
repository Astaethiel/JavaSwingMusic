package CS2020.assignment2;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static HashMap returnSongDurationAndTitleFormatted(ArrayList<Song> songList) {
        HashMap<UUID, String> map=new HashMap<UUID,String>();
        for (Song song : songList) {
            Integer minutes = song.getDuration()/60;
            Integer seconds = song.getDuration()%60;
            String time = minutes.toString() + ":" + seconds.toString();
            String titleString = song.getTitle() + " " + "(" + time + ")";
            map.put(song.getSongID(), titleString);
        }    
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
}
