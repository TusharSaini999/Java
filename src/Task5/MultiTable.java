package Task5;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}
