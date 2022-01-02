import java.util.Scanner;

public class fibbonic {
    int i,n,a=0,b=1;
    int c;
    public void show(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n= sc.nextInt();
        while (a<=n){
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
public static void main(String[] args){
        fibbonic obj=new fibbonic();
        obj.show();
}
}
