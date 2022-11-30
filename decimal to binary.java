import java.util.*;
class HARSHITHA{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scr.nextInt();
        int rem;
        int i=0;
        int a[] = new int[99];
        while(num>0){
            rem = num%2;
            a[i]=rem;
            num=num/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
