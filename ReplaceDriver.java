package Work;

import java.util.Scanner;

public class ReplaceDriver {
    public static int size;
    public static int i=0;
    public static String out="";
    public static String replace(String chr,char from,char to){
        
        if(i<size){
            if(chr.charAt(i)==from){
                out=out+to;
                i++;
                replace(chr, from, to);
            }
            else{
                out=out+chr.charAt(i);
                i++;
                replace(chr, from, to);
            }
        }
        return out;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the character to be replaced");
        char from=sc.next().charAt(0);
        System.out.println("Enter the character to be replaced with");
        char to=sc.next().charAt(0);
        size=str.length();
        System.out.println("The modified string is "+replace(str, from, to));
    }
}
