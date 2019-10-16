package com.org.assignment2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int var=0;
     int number;
     IsAmstrongNumber am=new IsAmstrongNumber();
     System.out.println();
     for(int i=100;i<999;i++) {
      if(am.isArmstrongNumber(i))
      {
    	  System.out.println(i);
    	  System.out.println("");
    	  
      }

     }
    }

}
