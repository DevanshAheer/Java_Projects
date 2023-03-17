import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //user u = new user();
        int flag=1;
        do{
            System.out.println("Enter your first name");
            String f  = sc.nextLine();

            System.out.println("Enter your last name");
            String l = sc.nextLine();

            System.out.println("Enter your age");
            String a = sc.nextLine();

            System.out.println("Enter your phone number");
            String p =  sc.nextLine();

            user u = user.getDetails(f,l,a,p);
            System.out.println(u.showDetails());
            File file_user = new File("test.txt");

            /*try{
                //File file_user = new File("test.txt");
                if(file_user.createNewFile())
                {
                    System.out.println("File created "+ file_user.getName());
                }
                else {
                    System.out.println("File Already created");
                }
            }
            catch(IOException e){
                System.out.println("Error Occurred"+e);
            }*/
            try(BufferedWriter br = new BufferedWriter(new FileWriter(file_user,true)))
            {
                br.write(u.showDetails());
                br.newLine();
            }
            catch(IOException e)
            {
                System.out.println("error Occurred"+e);
            }
            System.out.println("Do you want to Quit/Continue : (1/0)");
            flag = sc.nextInt();
        }while(flag==1);


    }
}