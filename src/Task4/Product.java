package Task4;

import java.util.Scanner;

//Product of the Two Floating Num
public class Product {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Num A: ");
        float a=scan.nextFloat();
        System.out.print("Enter the Num B: ");
        float b=scan.nextFloat();

        System.out.println("Product of the "+a+" and "+b+" is "+(a*b));
        scan.close();
    }
}
