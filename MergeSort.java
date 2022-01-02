import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first array length");
        n=sc.nextInt();
        System.out.println("enter a second array length");
        m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr3[]=new int[n+m];
        int i,j,k=0;
        System.out.println("enter a arr1");
        for(i=0;i<n;i++){
            n=sc.nextInt();
        }
        System.out.println("enter a arr2");
        for(j=0;j<m;j++){
            m=sc.nextInt();
        }
        while(i<n && j<m){
             if (arr1[i]<arr2[j]){
                 arr3[k]=arr1[i];
                 i++;
             }else{
                 arr3[k]=arr2[m];
                 j++;
             }
             k++;
        }
        while (i<n){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for (k=0;k<(n+m);k++){
            System.out.println(arr3[k]);
        }
    }

}
