package Java8Features;

public class ThreadDemo {

	public static void main(String[] args) 
	{
		//MyRunnable r = new MyRunnable();
		Runnable r = () -> 
		{
			for(int i=0;i<=2;i++)
			{
				System.out.println("Child thread");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
		for(int i=0;i<=2;i++)
		{
			System.out.println("Parent Thread");
		}
		

	}

}
