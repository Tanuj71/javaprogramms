import java.util.Scanner;

class oddeven {
    int a;
    int evensum = 0;
    int oddsum = 0;

    public void show() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find even or odd");
        a = sc.nextInt();

        for (int i = 0; i <= a; i++) {

            if (i % 2 == 0) {
                evensum += i;
                System.out.println("sum of even=" + evensum);
            }
            else {
                oddsum = oddsum + i;
                System.out.println("odd" + oddsum);
            }
        }
    }
}

public class test {
    public static void main(String[] args){

       oddeven obj=new oddeven();
       obj.show();
    }
}
