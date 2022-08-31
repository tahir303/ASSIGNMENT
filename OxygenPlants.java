package Assingmnet;
import java.util.Scanner;
public class Oxygen_plants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the floor area of the room(m*m)");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Enter the plant area of single plant(in cm2");
        float plant_area=sc.nextInt();
        float Total_plants=(l*b*100*100)/plant_area;
        Total_plants=Total_plants-Total_plants%10;
        System.out.println("Total Production od Oxygean="+(Total_plants*0.9));
    }

}
