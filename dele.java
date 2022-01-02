import java.util.Scanner;

public class dele {
    public static void main(String [] args){
        int n,i;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter a element position you are delete");
        m=sc.nextInt();
        for (i=0;i<n;i++){
            if(i<m){
                b[i]=a[i];
            }else if(i==m){
                continue;
            }
            else {
                b[i-1]=a[i];
            }
        }
        for (i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
