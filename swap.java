import java.util.Scanner;

public class Naveen{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the number a : ");
        a = scr.nextInt();
        System.out.print("Enter the number b : ");
        b = scr.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("value of a is "+a+"\nvalue of b is "+b);
    }
}
