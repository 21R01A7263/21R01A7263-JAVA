abstract class Shape 
{
	int a=2;
	int b=4;
	abstract void printArea();
}
class Rectangle extends Shape
{
			
	void printArea() 
	{

    		int r=a*b;
		System.out.println("Area for Rectangle="+r);
    	}
}
class Triangle extends Shape
{
	
	void printArea() 
	{
           int t=(a*b)/2;
	    System.out.println("Area for Triangle="+t);
	    
	}
}
class Circle extends Shape
{
	
	void printArea() 
	{
            int area=(int)(3.14*a*a);
     System.out.println("Area for Circle with radius "+a+" is= "+area);
	    
	}
                }
class AbstractDemo 
{
	public static void main(String args[]) 
	{
	    Rectangle r= new Rectangle();
	    Triangle t= new Triangle();
	    Circle c=new Circle();
	    Shape s;
            s=r;
            s.printArea();
            s=t;
            s.printArea();
            s=c;
            s.printArea();
   	}
}