import java.util.*;
class HARSHITHA{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
      System.out.print("Enter the binary number : ");
      int a = scr.nextInt();
      int rem,i=0,sum=0;
      while(a>0){
          rem = a%10;
          sum+=Math.pow(2, i)*rem;  
          i++;
          a = a/10;
      }
      System.out.print(sum+" ");
      
    }
}
