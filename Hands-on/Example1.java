//WAP to print any multiplication table.use exception handling and call Thread.Sleep method

package java.example1;

public class Example1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1 ; i <= 10 ; i++)
			{
				Thread.sleep(1000);	// sleep method of Thread Class
				System.out.println("\n" +i*7);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 table = new Example1();
		table.start();
	}

}
