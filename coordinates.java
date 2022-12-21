import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class coordinates{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the X co-ordinate :  ");
        int a = scr.nextInt();
        System.out.print("Enter the Y co-ordinate :  ");
        int b = scr.nextInt();
        int result = function(a, b);
        switch (result) {
            case 1, 2, 4, 3: System.out.println(result + " quadrant.");
                break;
            default:
                System.out.println("Invalid, Please enter the valid coordinates.");
        }


    }
    static int function(int A, int B){
        int c = A * B;
        if(c > 0){
            if(A > 0 ){
                return 1;
            }
            else{
                return 3;
            }
        }
        else{
            if(A > 0 ){
                return 4;
            }
            else{
                return 2;
            }
        }
    }
}
