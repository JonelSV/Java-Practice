package JavaPractice;

public class DeskPhone implements ITelephoneTim {
	
	boolean isRinging;
	int myNumber;
	
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk Phone is always on");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now Ringing" + phoneNumber + " on deskPhone");
	
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk Phone");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println(" Ring ring ring ");
		}else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}

}
