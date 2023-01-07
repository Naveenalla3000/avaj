package in_heretance;
/* implement multilevel Inheritance

    Question :- create a class klu with the method library(int n) which performs arithmetic operation based upon
                choose using switch. create a child class fed for the parent klu with the method palindrome(int p)
                which checks the given number is palindrome or not. create another child class rnd for the parent fed
                with the method fibonacci(int x) which display the fibonacci services. pass the values from the main function
                by taking input from keyboard.
*/
import java.util.Scanner;
class klu{
    public void library(int n){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a and b : ");
        int a = in.nextInt();
        int b = in.nextInt();
        switch (n) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            case 5 -> System.out.println(a%b);
            default -> System.out.println("Invalid option");
        }
    }
}

class fed_klu extends klu{
    public void palindrom(int p){
        int sum = 0,rem,z = p;
        while(p > 0){
            rem = p % 10;
            sum = sum * 10 + rem;
            p = p / 10;
        }
        if(sum == z){
            System.out.println("its palindrome");
        }
        else{
            System.out.println("its not palindrome");
        }
    }
}

class rnd_fed extends fed_klu{
    public void fibonaccii(int x){
        int a = 0,b = 1,c;
        System.out.println(a+" "+b);
        for(int i=2;i<=x;i++){
            c = a +b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
public class College {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        klu k = new klu();
        fed_klu f = new fed_klu();
        rnd_fed r = new rnd_fed();

        System.out.println("enter n,p,x : ");
        int n = in.nextInt();
        int p = in.nextInt();
        int x = in.nextInt();
        System.out.println("klu class:- ");
        k.library(n);         // method of grandparent class (calling its own function)
        System.out.println("_________________");
        f.palindrom(p);       // method of its own, and it is child class of grandparent class(klu)
        f.library(n);         // method of parent class calling by the child class(fed)
        System.out.println("_________________");
        r.fibonaccii(x);      // method of own, and it is child class of parent class(fed)
        r.palindrom(p);       // method of parent class(fed) calling by the child class(rnd)
        r.library(n);         // method of grandparent class(klu) calling by the grand child class(rnd)
        System.out.println("_________________");
    }
}
