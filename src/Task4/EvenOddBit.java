package Task4;

import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=scan.nextInt();

        if((n&1)==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
