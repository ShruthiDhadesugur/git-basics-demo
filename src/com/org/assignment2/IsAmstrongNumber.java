package com.org.assignment2;

public class IsAmstrongNumber {
    public static boolean isArmstrongNumber(int number) {

  int sum=0;
  int temp = number;
  while (temp != 0) {
      int a = temp % 10;
      sum += (a * a * a);
      temp =temp/ 10;
  }
  if(sum==number)
  {
	return true;  
  }
  return false;
  }
}




