package week3.day1;

public class iphone extends ios {
	public void makeCall()
	{
		System.out.println("calling from Iphone");
	}
	public void sendSMS()
	{
		System.out.println("sending SMS from iphone");
	}
	public static void main (String args[])
	{
		iphone phn = new iphone();
		phn.makeCall();
		phn.sendSMS();
		phn.increaseVolume();
	}

}
