import java.util.Scanner;

public class findnumber {
    public static void main(String[]  args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number");
        num=sc.nextInt();
        if(num<0){
            System.out.println("negativ"+num);
        }
        else if(num==0){
            System.out.println("zero"+num);
        }
        else{
            System.out.println("positive"+num);
        }
    }
}
