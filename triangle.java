import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a ,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b&&b==c&&c==a) {
            System.out.println("equivalence");
        }
        else if(a!=b&&b!=c&&c!=a){
            System.out.println("scales");
        }
        else {
            System.out.println("isoscales");
        }
    }
}
