final class Bike1{ 
	void run() 
        {
            System.out.println("final class");
	  }
} 
class Honda1 extends Bike1{  
    void run()
        {
            System.out.println("derived class");
        }
    }