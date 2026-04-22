package Task4;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("It is Leap Year");
        }else{
            System.out.println("It is Not Leap Year");
        }
    }
}
