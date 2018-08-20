/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author tldouglass
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[80];
        int[] scores = new int [80];
        readData( names, scores, args[0]);
    }
    public static void readData(String[] names, int[] scores, String filename){
            Scanner reader = null;
           try {
               reader = new Scanner(new File(filename));
           } catch (FileNotFoundException ex) {
               java.util.logging.Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
           }
            int currentIndex = 0;
            while(reader.hasNext()) {
                String[] split = reader.nextLine().split(" ");
            String[] line = null;
                names[currentIndex] = line[0];
                scores[currentIndex] = Integer.parseInt(line[1]);
                currentIndex ++;
    }
    }    
}
      
    