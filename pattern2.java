import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        int num,i,j;
        System.out.println("enter a number to pattern ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=0;i<=num;i++){
            for (j=0;j<=(num-i);j++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
