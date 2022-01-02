import java.util.Arrays;
public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
            System.out.println("second largest is"+arr[arr.length-2]);

    }
}