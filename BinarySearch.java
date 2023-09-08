/*binary search is applicable only when the array is sorted*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int num;
        System.out.println("Enter elements of the array of size 5 in a sorted way");
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the number you want to search");
        num= sc.nextInt();
        System.out.println(binarySearch(arr, num));
    }
    public static boolean binarySearch(int[] arr, int num){
        int l=0, h=4;
        int mid=(l+h)/2;
        while(l<=h){
            if(arr[mid]==num) return true;
            else if(arr[mid] > num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            mid=(l+h)/2;
        }
        return false;
    }
}
