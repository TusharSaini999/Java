package Task4;

import java.util.Scanner;

public class IsMale {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Is Male(true/false): ");
        boolean isMale=scan.nextBoolean();
        System.out.print("Enter the Name of the Human: ");
        String name=scan.next();

        if(isMale){
            System.out.println("Mr "+name);
        }
        else{
            System.out.println("Ms. "+name);
        }
    }
}
