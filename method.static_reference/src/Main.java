import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*
        // face is function that overrides the method doStuff should be static in nature.
        // the content or body is referenced not call by value.
        // this is static method referencing.
        Inter face = stuff::doStuff;
        face.doTask();

        //For creating the method referencing using obj of class stuff
        // st --> object class stuff.
        stuff st = new stuff();
        st.check_stuff();
        Runnable runnable = st::check_stuff;
        st.doStuff();
        System.out.println("Hello world!");*/


        //constructor referencing
        Inter face_In = constructor::new;

        constructor cons = face_In.getcon();
        cons.display();
    }
}