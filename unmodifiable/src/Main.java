import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //Demonstrate the use of repeat, strip, isBlank, indent, transform,
        // stripIndent, translateEscapes, formatted String methods.

        String string="abc";
        int count=3;
        System.out.println("String :"+string.repeat(count));

        String iam = "\n\t Bootcamp training 2023 ttn noida \u2003";
        System.out.println(iam.strip());
        System.out.println(iam.trim().equals("Bootcamp training 2023 ttn noida"));
        System.out.println(iam.trim());

        System.out.println(iam.isBlank());
        //System.out.println(iam.isEmpty());
        System.out.println("1.%s 2.%s 3.%s 4.%s 5.%s".formatted("one","two","three","four","five"));

        System.out.println("   hello world".stripIndent());
        System.out.println("hello world  ".stripIndent());
        System.out.println("   hello world  ".stripIndent());

        String str = "This is tab \t, Next New Line \n,next backspace \b,next Single Quotes \' next,Double Quotes \" ";
        System.out.println(str.translateEscapes());

    }
}