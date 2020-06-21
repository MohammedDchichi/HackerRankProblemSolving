import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
    	int maxResult=0;
    	List<Integer> listeResult=new ArrayList<Integer>();
    	
    	Arrays.stream(keyboards).forEach(keybord->{
    	Arrays.stream(drives).forEach(drive->{
    		if(drive+keybord<=b)listeResult.add(drive+keybord);
    	});
    		
    	});
    	if(listeResult!=null && !listeResult.isEmpty()) {
    		return Collections.max(listeResult);
    	}

    	return -1;
    }


    public static void main(String[] args) throws IOException {
    	//case test
    	int[] keyboards = {3, 1};
    	int[] drives = {5, 2, 8};
    	int budget = 10;
    	System.out.println(ElectronicsShop.getMoneySpent(keyboards, drives, budget));

    }
}
