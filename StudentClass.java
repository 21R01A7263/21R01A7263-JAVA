import java.util.Scanner;
 
class student{
      int number;
      String name ;String course;
          student()
          {
              int rollno=number;
              String stu_name=name;String department=course; 
          }
          void acceptdetails()
          {
              System.out.println("enter the student details from constuctor");
              Scanner sc=new Scanner(System.in);
              number=sc.nextInt();
              name=sc.nextLine();
              course=sc.nextLine();
          }
          void displayreturn()
          {
              System.out.println("rollno="+number+" "+   "stu_name="+name);
              System.out.println("department="+course);
 
          }
  }
public class Constructor {
 
 
    public static void main(String[] args) {
        int size;
        System.out.println("enter the total instances:");
        Scanner input=new Scanner(System.in);
        size=input.nextInt();
        student stu[]=new student[size];
        for(int i=0;i<size;i++)
        {
            stu[i]=new student();
            stu[i].acceptdetails();
        }
        System.out.println("student details");
        for (int i=0;i<size;i++)
            stu[i].displayreturn();
 
    }
 
}
