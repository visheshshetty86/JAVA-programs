import java.util.Scanner;

public class foodmenu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("hotel menu is \n 1.idli \n 2.dosa \n 3.vada \n 4.chai");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("your order for idli is placed");
                    break;
                }
                case 2:
                {
                    System.out.println("your order for dosa is placed");
                    break;
                }
                case 3:
                {
                    System.out.println("your order for vada is placed");
                    break;
                }
                case 4:
                {
                    System.out.println("your order for chai is placed");
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("soory we dont have it!!");
                    break;
                }
            }
        }
    }
}
