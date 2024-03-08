
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "database.txt";
        File database = new File(filename);
        if (new File(filename).exists()) {
            System.out.println("Error: file exists");

        } else {
            try {
                database.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}