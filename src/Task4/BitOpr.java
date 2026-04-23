package Task4;

import java.util.Scanner;

public class BitOpr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a=scan.nextInt();
        System.out.print("Enter the Number 2: ");
        int b=scan.nextInt();

        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("NOT of A: "+(~a));
        System.out.println("Left Shift of A: "+(a<<1));
        System.out.println("Right Shift of A: "+(a>>1));
    }
}
