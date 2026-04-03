package Task4;

import java.util.Scanner;

public class Swap {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number A: ");
        int a=scan.nextInt();
        System.out.print("Enter the Number B: ");
        int b=scan.nextInt();

        swapWithTemp(a,b);
        swapWithoutTemp(a,b);
        scan.close();
    }
    private static void swapWithTemp(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("After with Temp");
        System.out.println("A: "+a+" "+"B :"+b);
    }
    private static void swapWithoutTemp(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After without Temp");
        System.out.println("A: "+a+" "+"B :"+b);
    }
}
