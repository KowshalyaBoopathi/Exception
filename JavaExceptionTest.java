package com.exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaExceptionTest {
		  
	public static void main(String args[]){

//Arithmetic exception
		   try {
		   int data=100/0;
		   }
		   catch(Exception e) {
		   System.out.println(e);
		   }
		    
	        try {  
	        	PrintWriter pw = new PrintWriter("jtp.txt");    
	            pw.println("saved");  
	        }  
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	    System.out.println("File saved successfully");  
//multiple try catch blocks
	    try{    
            /*int a[]=new int[5];    
            a[5]=30/0;*/
	    	String s=null;
	    	System.out.println(s.length());
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }   
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              { 
        	   //System.out.println(e);
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code"); 
   	    try{    
            /*int a[]=new int[5];    
            a[5]=30/0;*/
	    	String s=null;
	    	System.out.println(s.length());
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }   
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              { 
        	   //System.out.println(e);
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code"); 
	}

}
