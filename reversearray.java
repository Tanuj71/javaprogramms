import java.util.Scanner;

public class reversearray {
    public static void main (String[] args) {

        //code
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        while(start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        }
    }

