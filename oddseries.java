import java.util.Scanner;

public class oddseries {
    int num;
    int sum=0;
    public void show(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num= sc.nextInt();
        for (int i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+i;

            }

            System.out.println("sum="+sum);
        }

    }
    public static void main(String[] args){
    oddseries obj=new oddseries();
    obj.show();
    }
}
