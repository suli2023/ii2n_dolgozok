package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Filehandler {
    
    final String filename = "dolgozok.txt";

    public void readFile() {
        //kivétel kezelés
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }
    public void tryReadFile() throws FileNotFoundException {
        //iparikód
        File file = new File(filename);
        Scanner sc = new Scanner(file, "utf-8");
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
