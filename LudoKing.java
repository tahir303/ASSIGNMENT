package Assingmnet;

import java.util.Scanner;

public class LudoKing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Alex_points=0;
        int Nikil_points=0;
        int Sam_points=0;
        boolean flag=true;
        System.out.println("Enter Alex points");
        Alex_points=sc.nextInt();
        if(flag){
            if(Alex_points>=0 && Alex_points<=50){
                System.out.println("Enter Nikil points");
                Nikil_points=sc.nextInt();
                if(Nikil_points>=0 && Nikil_points<=50){
                    System.out.println("Enter Sam points");
                    Sam_points=sc.nextInt();
                    if(Sam_points<0 || Sam_points>50){
                        System.out.println(Sam_points+" is invalid number");
                        flag=false;
                    }
                }
                else{
                    System.out.println(Nikil_points+" is invalid number");
                    flag=false;
                }
            }
            else{
                System.out.println(Alex_points+" is invalid number");
                flag=false;
            }
        }
        
        
        if(flag){
            if(Alex_points>Nikil_points && Alex_points>Sam_points){
                System.out.println("Alex scored"+Alex_points+" points and won the game");
            }
            if(Nikil_points>Alex_points && Nikil_points>Sam_points){
                System.out.println("Nikil scored "+Nikil_points+" points and won the game");
            }
            if(Sam_points>Alex_points && Sam_points>Nikil_points){
                System.out.println("Sam scored "+Sam_points+" points and won the game");
            }
        }
                
    }
    
}
