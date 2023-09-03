package week3.day1;

public class ios {
	public void startApp()
	{
		System.out.println("Starting Ios application");
	}
	public void increaseVolume()
	{
		System.out.println("Increasing voluming from Ios");
	}
		public void shutdown()
		{
			System.out.println("shutting down ios");
		}
	
	public static void main (String args[])
	{
		ios i = new ios();
		i.shutdown();
		i.startApp();
		i.increaseVolume();
	}

}
