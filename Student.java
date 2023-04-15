class Student{	
    int roll_no;  
    String name, department; 
      Student(int roll, String nam, String c) {
      roll_no = roll ; 
      name = nam;
      department = c;
    }  	
    void display(){
      System.out.println("the student details are:"+roll_no+","+name+","+department);
    }	 
    public static void main(String arg[]){  
      Student s1 = new Student(201, "HARI", "AID");
      Student s2 = new Student(202, "PRIYA", "AID");
      Student s3 = new Student(203, "KAVERI", "AID");	
          s1.display();  
       s2.display();
       s3.display();  
    }	      
  } 