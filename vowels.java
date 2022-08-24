import java.util.Scanner;

public class vowels {
     public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet");
        ch=sc.next().charAt(0);
        if((ch =='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
        {
            System.out.println("its a vowels");
        }
        else
        {
            System.out.println("its a consonent");
        }
        }    
    }

