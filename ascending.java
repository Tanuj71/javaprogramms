public class ascending {
    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 2, 0, 5};
        int i;
        int temp=0;
        System.out.println("unsorted array");
        for(i=0;i<= arr.length;i++){
            System.out.println(arr[i]);
        }
        for(i=0;i<= arr.length;i++){
            for (int j=i+1;j<=arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        for ( i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
