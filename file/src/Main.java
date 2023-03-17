import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
class file{

    public file()
    {

    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        file f = new file();
        Scanner sc = new Scanner(System.in);
        File new_file = new File("new_file");
        int count=0;
        try(BufferedWriter br = new BufferedWriter(new FileWriter(new_file)))
        {
            br.write("This is java Bootcamp from 24 feb to 20 march. This java classes in include " +
                    "java 9, java 3, java 10, java 17 ... java is independent platforms.");
            br.close();
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            // inputsteam pass the object of file to its constructor as parameter in fileinputstream.
            BufferedReader reader = null;
            FileInputStream fis = new FileInputStream(new_file);
            InputStreamReader input = new InputStreamReader(fis);
            reader = new BufferedReader(input);
            //System.out.println(data);
            String data;
            //int count = 0;
            while((data = reader.readLine()) != null) {
                if(data=="java"){
                count +=1;
                }
            }
            /*for (int i=0; i<data.length; i++) {
                //if (data[i] == "java") {
                    count++;
                //}
            }*/
            System.out.println("Total count of java word in file is: "+count);
            }    
            
        catch (IOException e)
            {
            System.out.println("An error has occurred.");
            e.printStackTrace();
            }
    }
}


