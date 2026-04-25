package Task5;

import java.util.Scanner;

public class LCM {
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a=scan.nextInt();
        System.out.print("Enter the Number 2: ");
        int b=scan.nextInt();
        int lcm=1;
        for(int i=2;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                    lcm=i;
                    break;
            }
        }
        System.out.println("LCM is "+lcm);
    }
}
