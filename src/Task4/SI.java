package Task4;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Price: ");
        float price=scan.nextFloat();
        System.out.print("Enter the time in years: ");
        float time=scan.nextFloat();
        System.out.print("Enter the Rate of interest: ");
        float interest=scan.nextFloat();

        System.out.println("Simple Interest is Rs "+((price*time*interest)/100));
        System.out.println("Compound Interest is Rs "+(price*(Math.pow((1+(interest/100)),time))));
    }
}
