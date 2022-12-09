import java.util.*;

public class HARSHITHA{
    public static void main(String[] args){
        student std= new student();
        Scanner scr = new Scanner(System.in);
          System.out.print("Enter the name : ");
        std.name=scr.nextLine();
        System.out.print("Enter the id : ");
        std.id=scr.nextInt();
      
        System.out.println(std.id+"\n"+std.name);
    }
}
class student{
    int id;
    String name;
}
