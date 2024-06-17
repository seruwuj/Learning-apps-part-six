import java.io.*;
import java.util.*;

public class TunaReadfromFiles {
    private Scanner X;

    public void openFile() {
        try {
            X = new Scanner(new File("James.txt"));
        } 
        catch (Exception e) {
            System.out.println("Could not find File");
        }
    }

    public void TunaReadfromFiles() {
        while (X.hasNext()) {
            String a = X.next();
            String b = X.next();
            String c = X.next();

            System.out.printf("%s %s %s\n", a, b, c);
        }
    }

    public void closeFile() {
            X.close();
        }
    }
