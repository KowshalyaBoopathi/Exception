package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        super(str);  
    }  
} 

public class ThrowException {
	/*public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
	public static void main(String args[]) {
		validate(12);
		System.out.println("Votted");
	}*/
	
	
	/*public static void read() throws FileNotFoundException {  
		  
        FileReader file = new FileReader("user.json");  
        BufferedReader fileInput = new BufferedReader(file);  
  
      
        //throw new FileNotFoundException("File not found");  
      
    }  
    public static void main(String args[]){  
        try  
        {  
            read();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code");    
  } */
  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            throw new UserDefinedException("This is user-defined exception");  
	        }  
	        catch (UserDefinedException e)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println(e);  
	        }  
	    }   
}
