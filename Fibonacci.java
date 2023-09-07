import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a term till which you want to find fibonacci");
        Scanner sc= new Scanner(System.in);
        int term= sc.nextInt();
        fibonacci(term);
    }
    public static void fibonacci(int term){
        int a=0, b=1;
        int fib=0;
        if(term== 1){
            System.out.println(a);
            return;
        }
        if(term==2){
            System.out.println(a+","+b);
            return;
        }
        System.out.print(a+","+b);
        for(int i=3; i<= term; i++){
            fib= a+b;
            System.out.print(","+fib);
            a=b;
            b=fib;
        }
        return;
    }
}
