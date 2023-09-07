/*Write code of Greatest Common Divisor
the algorithm:
1) find the larger number from a and b
2) subtract the smaller number from the larger number
3) keep on repeating this till you find both the numbers to be equal
4) then you got your answer
note: in recursive form the a is always the larger number and b is smaller
*/
import java.util.*;
class GCD {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers to find it's Greatest Common Divisor");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        gcd(a,b);
    }
    public static void gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("the GCD is:"+ a);
        return;
    }
}
