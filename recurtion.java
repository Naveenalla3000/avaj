import java.sql.*;
import java.util.*;
import java.io.*;
class Scratch {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = scr.nextInt();
        int factorial = function(a);
        System.out.println("Factorial of the number : "+ factorial);
    }
    static int function(int A){

           if( A == 1){
               return 1;
           }
           else{
               return A * function(A - 1);
           }
    }
}
