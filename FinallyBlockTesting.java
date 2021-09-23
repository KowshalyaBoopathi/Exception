package com.exceptions;

public class FinallyBlockTesting {
	public static void main(String args[]) {
		try{    
			   int data=25/0; //25/5;   
			   System.out.println(data);    
			  }    
			  catch(/*NullPointer*/Exception e){ //Exception 
			System.out.println(e);  
			}    
			 finally {  
			System.out.println("finally block");  
			}    
			    
			System.out.println("rest of the code");    		     
}
}
