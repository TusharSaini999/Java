package Task5;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        int rev=0;
        while(n>0){
            rev=(n%10)+(rev*10);
            n/=10;
        }
        System.out.println("Rev of the N is: "+rev);
    }
}
