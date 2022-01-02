import java.util.Scanner;

public class tcd {
    public static void main(String[] args){
        int p;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        if(p<=200){
            int g;
            g=sc.nextInt();
            int d=p/g;
            int r=p%g;
           if (d%2==0) {
               for (int i = 0; i < g; i++) {
                   System.out.println(d);
               }
           }
            else if(d%2!=0) {
                for(int i=0;i < g-1;i++){
                    System.out.println(d);
                }
                d+=r;
                System.out.println(d);
           }
        }
        else{
            System.out.println("Invalid");
        }
    }

}
