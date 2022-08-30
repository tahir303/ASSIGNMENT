package Assingmnet;

import java.util.Scanner;

public class SumOfTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1,sum=n;
        System.out.print("Sum="+n);
        while(i<10){
            sum+=n+i;
            System.out.print("+"+(n+i));
            i=i+1;
        }
        System.out.print("="+sum);
    }
}
