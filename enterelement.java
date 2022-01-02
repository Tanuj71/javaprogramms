public class enterelement {
    public static void main(String[] args) {
        int[] a = {10, 5, 21, 66, 88};
        int pos=4;
        int element=54;
        for(int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
