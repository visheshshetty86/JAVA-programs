import java.util.Scanner;

public class isupper {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");
        ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            System.out.println("is lucky");
        }
        else
        {
            System.out.println("do nothing");
        }
        
    }
    
}
