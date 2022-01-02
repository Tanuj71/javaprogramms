import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n, flag = 0;
        System.out.println("Enter a length of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a unsorted array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
