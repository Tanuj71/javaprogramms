import java.util.Scanner;

public class subarrsum {
    public static void main(String[] args){
        int n;
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                  found = true;
                  break;
                }
            }
            if(found){
                break;
            }
        }
        System.out.println("found"+found);
    }

}
