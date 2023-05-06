class static_outer_class_Demo{
    private static String str = "BeginnersBook";
    static class MyNestedClass{

     public void display() {
	   System.out.println(str); 
	}
   }
   public static void main(String args[])
   {
static_outer_class_Demo.MyNestedClass obj = new static_outer_class_Demo.MyNestedClass();
	obj.display();
   }
}