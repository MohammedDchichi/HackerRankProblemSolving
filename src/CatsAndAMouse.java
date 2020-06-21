import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    
    	int distanceBetweenMouseAndCatsA=Math.abs(z-x);
    	int distanceBetweenMouseAndCatsB=Math.abs(z-y);
    	
    	String result =distanceBetweenMouseAndCatsA>distanceBetweenMouseAndCatsB? "Cat B" :
    			((distanceBetweenMouseAndCatsA==distanceBetweenMouseAndCatsB)?"Mouse C": "Cat A" );
    		

    	return result;
    }


    public static void main(String[] args) throws IOException {
     int x=1,y=2,z=3;
     System.out.print(catAndMouse(x,y,z));
     
     x=1;y=3;z=2;
     System.out.print(catAndMouse(x,y,z));

    }
}
