import java.util.*;

public class naveen{
    public static void main(String[] args){
        for(int i=0;i<=100; i=i+1){
            int count=0;
            for(int j=1;j<=i;j=j+1){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+"");
            }
        }
    }
}
