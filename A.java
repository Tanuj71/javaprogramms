public class A {
    public void sum(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("sum=" + sum);

    }
    public static class B extends A{
        public void sum(int a,int b){
            int sum;
            sum=a+b;
            System.out.println("sumB="+sum);
        }
    }
    public static void main(String[] args){
        B obj=new B();
        obj.sum(5,5);
    }

}
