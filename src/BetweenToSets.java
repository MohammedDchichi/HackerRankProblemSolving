import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.swing.text.StyledEditorKit.BoldAction;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	Integer min= Collections.min(a);
    	Integer max= Collections.max(b);
    	if(min>max) return 0;
    	int currentIndex=min;
    	 boolean  isTrueArray1=false;
    	 boolean  isTrueArray2=false;
    	 int numberOfElementResult=0;
    	do {
    		for (Integer value : a) {
				if(currentIndex%value!=0) {
					isTrueArray1=false;
					break;
				}
				else isTrueArray1=true;
			}
    		for (Integer value : b) {
				if(value%currentIndex!=0) {
					isTrueArray2=false;
					break;
				}
				else isTrueArray2=true;
			}
    		if(isTrueArray1 && isTrueArray2)numberOfElementResult++;
    		currentIndex++;
    		isTrueArray1=false;
    		isTrueArray2=false;
    		
    	}while(currentIndex<=max);
    	
    	return numberOfElementResult;
    // Write your code here
    

    }
  

}

public class BetweenToSets {
    public static void main(String[] args) throws IOException {
    	
    	List<Integer> a= new ArrayList<Integer>();
    	a.add(2); 
        a.add(4); 
        
        List<Integer> b= new ArrayList<Integer>();
    	b.add(16); 
        b.add(32);
        b.add(96);
        System.out.print(Result.getTotalX(a, b));
        
        
    }
}
