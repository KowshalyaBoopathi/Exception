package com.exceptions;

public class JavaException{
	  public static void main(String args[]){
//Arithmetic exception
	   try
	   {
	      int data=100/0;
		  //System.out.println("Rest of the code executes");
	   }
	   catch(ArithmeticException e)
	   {
	   System.out.println(e);
	   }
	   System.out.println("Infinity Arithmrtic Exception");
//null pointer exception
	   try
	   {
		   String s = null;
		   System.out.println(s.length());
	   }
	   catch(NullPointerException e)
	   {
		   System.out.println(e);
	   }
	   System.out.println("Null pointer Exception");
//NumberFormatException
		try 
		{
			String s="cows";  
			int i=Integer.parseInt(s);
		 }
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		 System.out.println("Number Format Exception");
//Array index out of bound exception
		 try
		 {
			 int s[]=new int[3];
			 s[5]=5;
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
				System.out.println(e); 
		 }
		 System.out.println("Array is out of bounds Exception");
//String index out of bound exception
		 try
		 {
			 String str="Hello Java";
			 System.out.println(str.length());
			 str.charAt(15);
			 //System.out.println(str.substring(11));
		 }
		 catch(StringIndexOutOfBoundsException e)
		 {
				System.out.println(e); 
		 }
		 System.out.println("String is out of bounds Exception");
	}
	}
