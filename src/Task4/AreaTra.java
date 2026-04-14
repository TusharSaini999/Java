package Task4;

import java.util.Scanner;

public class AreaTra {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Breadth: ");
        float b=scan.nextInt();
        System.out.print("Enter the Height: ");
        float h=scan.nextInt();
        System.out.println("Area of the Triangle: "+((1.0/2.0)*b*h)); //(1.0/2.0)==0.5
        scan.close();
    }
}
