package Task4;

import java.util.Scanner;

public class GreaterThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a=scan.nextInt();
        System.out.print("Enter the Number 2: ");
        int b=scan.nextInt();
        System.out.print("Enter the Number 3: ");
        int c=scan.nextInt();

        if(a>b && a>c){
            System.out.println("A is Grater");
        }else if(b>a && b>c){
            System.out.println("B is Grater");
        }else {
            System.out.println("C is Grater");
        }

    }
}
