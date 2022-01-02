import java.util.Locale;
import java.util.Scanner;

public class stringinputcheck {
    public static void main(String[] args){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        ch=sc.next().charAt(0);
        if((ch>= 'a' && ch<='z')^(ch>='A' && ch<='Z')){
            System.out.println("alphabet"+ch);
        }
        else if(ch>=0 && ch<=9){
            System.out.println("number"+ch);
        }
        else{
            System.out.println("special"+ch);
        }
    }

}
