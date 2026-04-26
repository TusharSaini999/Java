package Task5;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=scan.nextInt();
        if(n==1){
            System.out.println("1");
        }else if(n==2){
            System.out.println("1 2");
        }else{
            int first=1;
            int sec=2;
            System.out.print("1 2");
            for(int i=3;i<n;i++){
                int curr=first+sec;
                System.out.print(" "+curr);
                first=sec;
                sec=curr;
            }
        }

    }
}
