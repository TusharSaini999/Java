package Task5;

import java.util.Scanner;

public class SumOfInt {
    public  static  void main(String []arg){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}
