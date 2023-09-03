package week3.day1;

public class MyPhone extends ios{
	
	public static void main (String [] args)
	{
	iphone phn = new iphone();
	phn.sendSMS();
	phn.shutdown();
	phn.startApp();
	phn.increaseVolume();
	phn.makeCall();
	
	//phn.watchmovie();(It is not possible beacause created object for iphone and 
	//multiple inheritance not possible.
	
	
	}

}
