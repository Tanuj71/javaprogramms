import java.util.Scanner;

public class insert {
    public static void main(String[] args){
        int n,i,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n+1];
        System.out.println("enter a array");
        for (i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter a element you are inserting");
        m=sc.nextInt();
        for (i=0;i<n;i++){
            if(i<m){
                b[i]=a[i];
            }else if(i==m){
                b[i]=m;
            }else {
                b[i]=a[i-1];
            }
        }

        for (i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
