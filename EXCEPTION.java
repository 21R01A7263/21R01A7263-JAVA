import java.util.Scanner;
class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  
	class TestCustomException1{  
 
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
 
	   public static void main(String args[]){  
 
          System.out.println("Enter age");
          Scanner input = new Scanner(System.in);
          int age = input.nextInt();
	      try{ 
 
	      validate(age);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
 
	      System.out.println("Custom exception Demo completed...");  
	  }  
	}  
