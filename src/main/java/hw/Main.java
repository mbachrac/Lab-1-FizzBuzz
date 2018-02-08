package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
  public static void main(String[]args)
  {
    int number=Integer.parseInt(args[0]);
    for(int i=1;i<=number;i++)
    {
      if ((i%3==0)&&(i%5==0))
        System.out.println("Fizz Buzz");
      else if(i%3==0)
        System.out.println("Fizz");
      else if(i%5==0)
        System.out.println("Buzz");
      else
        System.out.println(i);
    }
  }
}
