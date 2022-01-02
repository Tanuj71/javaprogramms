import java.util.Scanner;

public class removeeven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an element length");
        n=sc.nextInt();
        int[] arr1=new int[n];
        int count=0;
        System.out.println("enter an array");
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]%2!=0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr1[count]);
        }
    }
}
