package Task3;
import java.util.Scanner;

public class Add {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int a=s.nextInt();
        System.out.print("Enter the Number :");
        int b=s.nextInt();

        System.out.println("Add of "+a+" And "+b+" is :"+(a+b));
    }
}
