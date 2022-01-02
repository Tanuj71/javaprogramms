public class deleteelement {
    public static void main(String[] args) {
        int[] a ={10, 20, 33, 55, 53, 55,82};
        int del = 53;
        for (int i = 0; i < a.length; i++) {
            if (del == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                break;
            }

        }
            for (int i=0;i< a.length-1;i++){
                System.out.println(" "+a[i]);
            }
        }
    }