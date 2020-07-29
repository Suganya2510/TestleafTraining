package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	public void connectWhatsapp() {
	System.out.println("ConnectWhatsapp");	
	
		}
	
	public void takeVideo() {
		System.out.println("TakeVideo");
		
	}
		public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.saveContact();
		sp.sendMessage();
		sp.makeCall();
		sp.takeVideo();
		sp.connectWhatsapp();
		
		
	}
}

