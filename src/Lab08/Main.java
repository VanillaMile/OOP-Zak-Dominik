package Lab08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        IOExceptionExample();
    }

    public static void IOExceptionExample(){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("src/Lab08/file.txt"));
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error found: " + e.getMessage());
        } finally {
            if (reader != null){
                try {
                    reader.close();
                    System.out.print("File ");
                }catch (IOException e){
                    System.out.println("Couldn't close: " + e.getMessage());
                }
            }
            System.out.println("Closed");
        }
    }
}
