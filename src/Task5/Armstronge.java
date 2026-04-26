package Task5;

import java.util.Scanner;

public class Armstronge {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        int comp=n;
        String s=Integer.toString(n);
        int size=s.length();
        int finalSum=0;
        while(n>0){
            finalSum+=Math.pow((n%10),size);
            n/=10;
        }
        if(finalSum==comp){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }
    }
}
