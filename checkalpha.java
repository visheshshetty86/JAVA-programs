import java.util.Scanner;

public class checkalpha {
    public static void main(String ags[])
    {
       // char ch='a';
       char ch;
       System.out.println("please enter the char");
       Scanner sc=new Scanner (System.in);
       ch=sc.next().charAt(0);

    if(ch>='0' && ch<='9')
    {
        System.out.println("its a number");
    }
    else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
    {
        System.out.println("its a charecter");
    }
    else
    {
        System.out.println("its a special charecter");
    }
}
}
