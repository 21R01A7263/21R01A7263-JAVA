
import java.util.Scanner;
class SortingString {
    public static void main(String args[])
    {
        String temp;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        String names[]=new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("enter names:");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name ["+(i+1)+"]:");
            names[i]=s1.nextLine();
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(names[i].compareTo(names[j])>0)
                        {
                            temp=names[i];
                            names[i]=names[j];
                            names[j]=temp;
                            
                        }
            }
        }
        System.out.println("\nSorted names are in ascending order");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
    
}
