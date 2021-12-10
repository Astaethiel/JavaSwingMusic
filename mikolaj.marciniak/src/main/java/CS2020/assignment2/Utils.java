package CS2020.assignment2;

import java.util.*;

public class Utils {
    public static HashMap returnSongDurationAndTitleFormatted(ArrayList<Song> songList) {
        HashMap<UUID, String> map=new HashMap<UUID,String>();//Creating HashMap
        for (Song song : songList) {
            Integer minutes = song.getDuration()/60;
            Integer seconds = song.getDuration()%60;
            String time = minutes.toString() + ":" + seconds.toString();
            String titleString = song.getTitle() + " " + "(" + time + ")";
            map.put(song.getSongID(), titleString);
        }    
        }
        
        
    }
    
}
