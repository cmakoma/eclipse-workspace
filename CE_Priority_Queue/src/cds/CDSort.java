// Assignement CE_Priority_Queue
// Program CDSort
// Author Christian Makoma
// Created Feb 27, 2020


package cds;

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Iterator;


public class CDSort {

    public static void main(String[] args) {
        String file_name = "cds.txt";

        //DO THIS
        //use pq sort on the array of cds
        //print out the cds showing sorted order by title
        
    }

    private static CD[] readMusic(String file_name) {
        ArrayList<CD> cds = new ArrayList<CD>();

        ReadTextFile file = new ReadTextFile(file_name);
      String str = file.readLine();
      while (!file.EOF()){
            String title = file.readLine();
            int year = Integer.parseInt(file.readLine());
            int rating = Integer.parseInt(file.readLine());
            int numTracks = Integer.parseInt(file.readLine());
            CD cd = new CD(title, str, year, rating, numTracks);

            cds.add(cd);
            int tracks = 1;

            while (tracks <= numTracks) {
                String temp = file.readLine();
                String[] line = temp.split(",");
                String len = line[0];
                String songTitle = line[1];
                Song song = new Song(songTitle, len);
                cd.addSong(song);
                tracks++;
            }

            str = file.readLine();
        }

        int num_cds = cds.size();
        CD[] cd_array = new CD[num_cds];

        int count = 0;
        for (CD cd : cds) {
            cd_array[count] = cd;
            count++;
        }

        return cd_array;
    }
}
