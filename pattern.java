import java.util.Scanner;
public class pattern{
    public static void main(String[]args){
        int n;
        System.out.print("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i,j,k;
        for(i=0;i<=n;i++){
            for(j=n;j>i;j--){
                System.out.print(" ");  
            }
                for(k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}