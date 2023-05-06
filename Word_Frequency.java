import java.util.Scanner;
import java.lang.String;
class frequency_count {
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);           
        System.out.println("Enter the String: ");
        String str=SC.nextLine();
        System.out.println("Enter substring: ");
        String sub=SC.nextLine();
        int index,count=0;
        for(int i=0; i+sub.length()<=str.length(); i++)
        {
       index=str.indexOf(sub,i);
            if(index>=0)
            {
                count++;
                i=index;
                index=-1;
            }
        }
  System.out.println("Occurence of '"+sub+"' in String is "+count);
}
}