import java.util.Scanner;
public class naveen{
    public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = scr.nextLine();
        
        int i=0,x=0,y=0,z=0,w=0,v=0;
        while((str.charAt(i))=='\0'){
            if(str.contains("a")){
                x=1;
            }
            else if(str.contains("e")){
                y=1;
            }
            else if(str.contains("i")){
                z=1;
            }
            else if(str.contains("o")){
                w=1;
            }
            else if(str.contains("u")){
                v=1;
            }
        i=i+1;
        }
        
        if(x==1&&y==1&&z==1&&w==1&&v==1){
            System.out.println("Yes! ");
        }
        else{
            System.out.println("No! ");
        }
    }
}
