import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        File myFile = new File("first_f.txt");
        try
        {
            //File myFile = new File("first_f.txt");
            if (myFile.createNewFile())
            {
                System.out.println("File created. "+ myFile.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred."+ e);
        }

        //File myFile = new File("first_f.txt");

        BufferedWriter br = new BufferedWriter(new FileWriter(myFile));
        br.write("Hello world. I am Devansh Aheer");
        //br.write("\n");
        br.write("I am back to World of code");
        br.write("Bye hello world");
        br.close();
        //System.out.println(myFile.canRead());
        try {
            BufferedReader in = new BufferedReader( new FileReader("first_f.txt"));
            String str = in.readLine(); //reads only line in text --> first_f.txt;

            System.out.println(str);
        }

        // Catch block to handle IO exceptions
        catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }

    }
}