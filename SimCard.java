package Assingmnet;

import java.util.Scanner;

public class SimCard {
    public static void main(String[] args) {
        long phone_number=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the phone number");
        phone_number=sc.nextLong();
        int even=0,odd=0;
        while(phone_number!=0){
            int rem=(int) (phone_number%10);
            if(rem%2==0){
                even+=rem;
            }
            else{
                odd+=rem;
            }
            phone_number=phone_number/10;
        }
        if(even==odd){
            System.out.println("Sum of odd and even are equal");
        }
        else if(even<odd){
            System.out.println("Sum of odd is greater than sum of even");
        }
        else{
            System.out.println("Sum of even is greater than sum of odd");
        }
    }
}
