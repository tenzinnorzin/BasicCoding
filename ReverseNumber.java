import java.util.*;
class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int rev=0;
        while(num!=0){
            rev= rev*10 + (num%10);
            num= num/10;
        }
        System.out.println("the reversed number is:"+rev);
    }
}
