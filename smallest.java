import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        if(a<b && a<c && a<d)
        {
            System.out.println("a is smallest");
        }
        else if(b<a && b<c && b<d)
        {
            System.out.println("b is samallest");
        }
        else if(c<a && c<b && c<d)
        {
            System.out.println("c is smallest");
        }
        else if(d<a && d<b && d<c)
        {
            System.out.println("d is smallest");
        }
        else{
            System.out.println("error found");
        }
    }
}
