package Task5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        int comp=n;
        int rev=0;
        while(n>0){
            rev=(n%10)+(rev*10);
            n/=10;
        }
        if(comp==rev){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
