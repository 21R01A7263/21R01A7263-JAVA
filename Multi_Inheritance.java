interface Printable{  
	void print();  
	}  
	interface Showable{  
	void show();  
	}  
	class multiple_inheritance implements Printable, Showable{  
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	  
	public static void main(String args[]){  
	multiple_inheritance obj = new multiple_inheritance ();  
	obj.print();  
	obj.show(); 
    }  
	}  