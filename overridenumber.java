import java.util.Scanner;

public class overridenumber {
    public  static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]!=i+1){

                    System.out.println(i + 1);
                    break;

            }
        }
    }
}
