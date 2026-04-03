package Task4;

import java.util.Scanner;

public class Arith {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number A: ");
        int a=scan.nextInt();
        System.out.print("Enter the Number B: ");
        int b=scan.nextInt();

        System.out.println("A + B: "+(a+b));
        System.out.println("A - B: "+(a-b));
        System.out.println("A * B: "+(a*b));
        System.out.println("A / B: "+(a/b));
        System.out.println("A % B: "+(a%b));

        System.out.print("Enter the Number X: ");
        double x=scan.nextDouble();
        System.out.print("Enter the Number Y: ");
        double y=scan.nextDouble();

        System.out.println("X + Y: "+(x+y));
        System.out.println("X - Y: "+(x-y));
        System.out.println("X * Y: "+(x*y));
        System.out.println("X / Y: "+(x/y));
        System.out.println("X % Y: "+(x%y));


        scan.close();
    }
}
