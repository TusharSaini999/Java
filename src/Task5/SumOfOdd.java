package Task5;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of the Odd:"+sum);
    }
}
