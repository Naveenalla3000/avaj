import java.sql.*;
import java.util.*;
import java.io.*;
class Scratch {
    public static int function(int A, int B){
        int c;
        c = A + B;
        return c;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the a : ");
        a = scr.nextInt();
        System.out.print("Enter the b : ");
        b = scr.nextInt();
        int sum = function(a,b);
        System.out.println(sum);
    }
}
