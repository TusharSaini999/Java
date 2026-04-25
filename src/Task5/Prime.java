package Task5;

import java.util.Scanner;
import java.util.SortedMap;

public class Prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Prime Number: ");
        int n=scan.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is Prime Number");
        }else{
            System.out.println("It is not Prime Number");
        }
    }
}
