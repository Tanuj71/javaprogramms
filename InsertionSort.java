import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        System.out.println("Enter a unsorted array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (i=1;i<n;i++) {
            int temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        for (i=0;i<n;i++)
            System.out.println(arr[i]);




    }
}
