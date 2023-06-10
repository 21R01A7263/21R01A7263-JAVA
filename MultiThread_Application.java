import java.util.*;
class Odd implements Runnable
{
	int i;
	Odd(int i)
	{
		this.i = i;
	}
	public void run()
	{
		System.out.println("Cube of "+i+" is "+(i*i*i));
	}
}
class Even implements Runnable
{
	int i;
	Even(int i)
	{
		this.i = i;
	}
	public void run()
    {
		System.out.println("Sqaure of "+i+" is "+(i*i));
	}
}
class Random1 extends Thread
{
	public void run()
	{
		int j=0;
		Random  rand = new Random();
		while(true){
			j = rand.nextInt(20);
			if(j%2!=0)
			{
				Odd o = new Odd(j);
			Thread t1 = new Thread(o);
				t1.start();
				try
				{
				Thread.sleep(2000);
				}
				catch(InterruptedException ie)
				{ }
			}
			else
			{
				Even e = new Even(j);
			Thread t2 = new Thread(e);
				t2.start();
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{ }
			}
		}
	}
}
class mt6c
{
	public static void main(String[] a)
	{
		Random1 r = new Random1();
		Thread t = new Thread(r);
		t.start();
        }
}