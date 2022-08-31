package Assingmnet;

import java.util.Scanner;

public class SumOfTen {
    static int sum=0;
    static int i=0;
    public static int sumoften(int num){

        if(i==10){
            return sum;
        }
        else{
            i=i+1;
            sum=sum+i;
            num=num+1;
            return sumoften(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.print("The sum of ten numbers is "+sumoften(n));
    }
}
