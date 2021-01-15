package check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	/*	 InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader  input=new BufferedReader(r);
	*/
	
	long aaa[]={10,11,12};
	String ss=Arrays.toString(aaa);
     ss=ss.replace("[","").replace("]","");
    System.out.println(ss);
   
	}		
		static boolean areAnagram(char[] str1, char[] str2)
	    { 
	        // Get lenghts of both strings 
	        int n1 = str1.length; 
	        int n2 = str2.length; 
	  
	        // If length of both strings is not same, 
	        // then they cannot be anagram 
	        if (n1 != n2) 
	            return false; 
	  
	        // Sort both strings 
	        Arrays.sort(str1); 
	        Arrays.sort(str2); 
	  
	        // Compare sorted strings 
	        for (int i = 0; i < n1; i++) 
	            if (str1[i] != str2[i]) 
	                return false; 
	  
	        return true; 
	    } 
	}
	

