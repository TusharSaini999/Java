package Task4;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the F: ");
        float a=scan.nextFloat();
        System.out.println("F to C: "+((a-32)*(5.0/9.0)));
        scan.close();
    }
}
