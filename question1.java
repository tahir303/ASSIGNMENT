package Assingmnet;
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Applicant_name;
        int Marks_obtained_in_HSC;
        int Total_possible_marks_in_HSC;
        float Engineering_cutoff_mark;
        int Marks_obtained_in_SSLC;
        int Total_possible_marks_in_SSLC;
        char Gender;

        System.out.println("Applicant name");
        Applicant_name=sc.nextLine();
        System.out.println("Marks obtained in HSC");
        Marks_obtained_in_HSC=sc.nextInt();
        System.out.println("Total possible marks in HSC");
        Total_possible_marks_in_HSC=sc.nextInt();
        System.out.println("Engineering cutoff mark");
        Engineering_cutoff_mark=sc.nextFloat();
        System.out.println("Marks obtained in SSLC");
        Marks_obtained_in_SSLC=sc.nextInt();
        System.out.println("Total possible marks in SSLC");
        Total_possible_marks_in_SSLC=sc.nextInt();
        System.out.println("Gender");
        Gender=sc.next().charAt(0);




        System.out.println("Your Application has been Submitted Successfully");
        System.out.println("The name of the applicant:"+Applicant_name);
        System.out.println("Enginnering Cutoff:"+Engineering_cutoff_mark);
        System.out.println("Applicant gender:"+Gender);
        System.out.println("All the best for your Career");



    }
}
