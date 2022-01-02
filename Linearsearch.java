import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args){
      int n;
      int flag=0;
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a length a array");
        n=sc.nextInt();
      int arr[]=new int[n];
        System.out.println("Enter an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a search key");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==k){
               flag=1;
            }
        }
        if(flag==0){
            System.out.println("not present");
        }
        else {
            System.out.println("Present");
        }
    }
}
