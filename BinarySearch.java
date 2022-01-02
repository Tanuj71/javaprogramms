import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of arrray");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        System.out.println("enter key");
        int k=sc.nextInt();
        while (low<=high){
            int medium=(low+high)/2;
            if(arr[medium]==k){
                System.out.println("key"+arr[medium]);
            }
            else {
                System.out.println("not");
            }
            if(k<arr[medium]){
                high=medium-1;
            }
            else {
                low=medium+1;
            }
        }
    }
}
