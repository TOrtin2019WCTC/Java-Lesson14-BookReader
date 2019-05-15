/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Scanner;

/**
 *
 * @author tim
 */
public class ReadFromUser extends BookReader {
    String line;
   Scanner keyboard = new Scanner(System.in);
    
    @Override
    void initialize() {
        System.out.println("Enter lines of stuff");
        line = keyboard.nextLine();
    }

    @Override
    void startReading() {
        if (line != null){
            System.out.println(line);
        }
    }

    @Override
    void stopReading() {
    }
    
}
