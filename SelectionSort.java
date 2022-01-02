import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,f=0;
        System.out.println("enter array");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (i=0;i<n;i++){
            int min=i;
            for (j=i+1;i<n;i++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=0;
                    temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            f=1;
        }
        if (f==1)
        for (i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
