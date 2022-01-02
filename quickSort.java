import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        int n;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of an array");
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pivot=arr.length-1;
        int i=0;
        int j=0;
        while (i<=pivot){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                System.out.println(arr[i]);
            }
            i++;

            }
        }

    }

