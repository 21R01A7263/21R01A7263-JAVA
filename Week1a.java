import java.util.Scanner;

public class Week1a{
    public static void main(String[] args){
        int a,b,c;
        double root1,root2;
        Scanner input =  new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        double det=(b*b) - (4*a*c);
        System.out.println("Determinent is "+det);
        if(det>0)
        {
            System.out.println("Roots are real and distinct");
        }
        else if(det==0)
        {
            System.out.println("Roots are real and equal");
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}