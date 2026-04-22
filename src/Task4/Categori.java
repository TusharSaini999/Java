package Task4;

import java.util.Scanner;

public class Categori {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Age");
        int age=scan.nextInt();

        if(age>60){
            System.out.println("Senior");
        }else if(age>=20){
            System.out.println("Adult");
        }else if(age>=13){
            System.out.println("Teen");
        }else if(age>0){
            System.out.println("Child");
        }
    }
}
