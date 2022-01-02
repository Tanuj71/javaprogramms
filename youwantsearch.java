import java.util.Scanner;

public class youwantsearch {
    public static void main(String[] args) {
        int arr[] = {10, 50, 5, 2, 70, 11};
        int n;
        boolean get=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("search number you want");
        n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                get = true;
                break;
            }
        }
        if(get){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }

}