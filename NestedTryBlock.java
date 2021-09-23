package com.exceptions;

public class NestedTryBlock {
	/*public static void main(String args[]) {
	try { 
		
		
        try {
        	System.out.println("/ zero");
            int b=30/0;
        }
        catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }
        
        try {
        	int a[]=new int[5];
        	a[5]=20;
        }
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println(e);  
          }
 

        try {
    	String s=null;
    	System.out.println(s.length());
        }
       catch(NumberFormatException e)//actually nullpointerexception
          { 
    	   System.out.println(e);
          }
        System.out.println("rest of the code inner"); 
	}
	
	catch(Exception e) {
		System.out.println("Last try block");
	}
       System.out.println("rest of the code"); 
	}*/
	
	public static void main(String args[])  
    {  
        try {  
    
            try {  
    
                try {  
                    int arr[] = { 1, 2, 3, 4 };  
                     System.out.println(arr[10]);  
                }  
                    catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception");  
                    System.out.println(" inner try block 2");  
                }  
            }  
                catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        }  
    
        /*catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println(e);  
            System.out.println(" outermost try block");  
        }*/  
        catch (Exception e) {  
            System.out.println(e);  
            System.out.println(" handled in main try-block");  
        }  
    }  
}  

