/*==============================================
Class Choose
Contains keyboard input
Contains methods to pause the game
============================================*/

import java.util.*;
import java.io.*;
import java.lang.Integer;

public class Choose{

    public String chooseString(String s) {
	//parameter not used, sorry about that!
      InputStreamReader in;
      BufferedReader bin;     
      bin = new BufferedReader(new InputStreamReader(System.in));
      s = "";
      try { s = bin.readLine();
      }
      catch( IOException e ) {
        System.out.println( "i/o exception" );
        s = "DEFAULT";
      } 
      return s;
    }
    
    public int chooseInt(String s) {
      return Integer.parseInt(chooseString(s));
    }


    public void cont() {
	String s = "\n\n================================================================================";
	s+= "\nAre you ready to move on?";
	s+= "\n================================================================================";
	s+= "\nPlease press enter to continue...";

	    System.out.println(s);
	    String t = "";
	    t = chooseString(t);
    }//end cont()

    public void cont2() {
	String t = "";
	t = chooseString(t);
    }//end cont()
 
}//end class Choose