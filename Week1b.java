import java.util.Scanner;
public class Week1b {
    public static void main(String[] args)
    {
        int n,p,i,j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range for prime numbers");
        n=input.nextInt();
        if(n==0 || n==1)
        {
            System.out.println("No prime numbers");
        }
        else{
            for(i=2;i<=n;i++)
            {
                p=0;
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        p=1;
                    }
                }
                if(p==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
    
}
