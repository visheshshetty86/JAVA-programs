import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your coice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("dancing");
                break;
            }
            case 2:
            {
                System.out.println("mono acting");
                break;
            }
            case 3:
            {
                System.out.println("singing");
                break;
            }
            default :
            {
                System.out.println("sleeping");
                break;
            }
        }
        
    }
    
}
