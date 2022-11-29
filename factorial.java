import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner scr = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int a = scr.nextInt();
      int fact = 1;
      for(int i = 1;i<=a;i++){
          fact = fact*i;
      }
      System.out.print("Factorial of "+a+" is "+fact);
      
    }
}
