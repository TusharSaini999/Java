package Task5;

import java.util.Scanner;

public class Fact {
    public static void main(String[] s){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=scan.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
