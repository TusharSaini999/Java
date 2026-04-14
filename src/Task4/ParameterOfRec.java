package Task4;

import java.util.Scanner;

public class ParameterOfRec {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Side: ");
        int a=scan.nextInt();
        System.out.print("Enter the Side: ");
        int b=scan.nextInt();
        System.out.print("Enter the Side: ");
        int c=scan.nextInt();
        System.out.print("Enter the Side: ");
        int d=scan.nextInt();

        System.out.println("Perameter is the : "+(a+b+c+d));
    }
}
