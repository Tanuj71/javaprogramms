import java.util.Scanner;

public class subsummaxi {
    public static void main(String[] args){
        int n,i;
          int cursum=0;
          int maxsum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array length");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter a array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
           cursum+=arr[i];
           if(cursum>maxsum){
               maxsum=cursum;
           }
           if(cursum<0){
               cursum=0;
           }
        }
        System.out.println("maxsum"+maxsum);
    }

}
