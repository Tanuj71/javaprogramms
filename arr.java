public class arr {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 5, 16, 33};
        int b[] = {1, 2, 3, 7, 8, 10, 11};

        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c++;
                }
            }
            if (c == 1) {
                System.out.println("missing" + a[i]);

            }
        }
    }
}