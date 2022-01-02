public class mergearray {
    public static void main(String[] args){
        int[] a={10,20,50};
        int[] b={5,7,64,22};
        int a_len=a.length;
        int b_len=b.length;
        int c_len=a_len+b_len;
        int[] c=new int[c_len];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[a_len+i]=b[i];
        }
        for (int i=0;i<c_len;i++){
            System.out.print(c[i]+" ");
        }
    }
}
