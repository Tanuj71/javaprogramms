import java.util.Scanner;

public class sume {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        int average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<a.length;i++) {

            sum = sum + a[i];

            average = sum / 5;
        }
            System.out.println(sum + "sum" + "average="+average );


    }
}