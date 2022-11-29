import java.util.Scanner;
public class harshitha{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        
        int a[][] = new int[99][99];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the element a["+i+"]["+j+"] : ");
                a[i][j] = scr.nextInt();
            }
        }
        
        int b[][] = new int[99][99];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter the element b["+i+"]["+j+"] : ");
                b[i][j] = scr.nextInt();
            }
        }
        
        int mat[][] = new int[99][99];
         
        for(int l=0;l<3;l++){
            for(int m=0;m<3;m++){
                mat[l][m]=0;
                for(int k=0;k<3;k++){
                    mat[l][m]= mat[l][m]+a[l][k]*b[k][m];
                }
            }
        }
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.println(mat[x][y]+"");
            }
            System.out.println();
        }
        
    }
}
