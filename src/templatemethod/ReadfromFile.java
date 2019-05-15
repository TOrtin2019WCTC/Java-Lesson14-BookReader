package templatemethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile extends BookReader {
    String path = null;
    BufferedReader reader = null;
    
    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        this.path = "prideprejudice.txt";
    }

    @Override
    void startReading() {
       
        String line;


        try {
            this.reader = new BufferedReader(new FileReader(path));
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }

    }

    @Override
    void stopReading() {
        try {
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
