package JavaPractice;

public class MainTelephone {

	public static void main(String[] args) {
		ITelephoneTim JonelsPhone;
		JonelsPhone = new DeskPhone(9876);
		JonelsPhone.powerOn();
		JonelsPhone.callPhone(9876);
		JonelsPhone.answer();
		
		JonelsPhone = new MobilePhone(1234);
		JonelsPhone.powerOn();
		JonelsPhone.callPhone(1234);
		JonelsPhone.answer();
		
	}

}
