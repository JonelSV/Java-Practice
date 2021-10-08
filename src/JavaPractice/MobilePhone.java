package JavaPractice;

public class MobilePhone implements ITelephoneTim {
	
	private boolean isRinging;
	private int myNumber;
	private boolean isOn = false;
	
	public MobilePhone (int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile Phone is powered up");
		
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
					System.out.println("Now Ringing" + phoneNumber + " on deskPhone");
		}else {
			System.out.println("Phone is switched off");
		}
	}	

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the Mobile Phone");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println(" Nokia ring ring ");
		}else {
			isRinging = false;
			System.out.println("Mobile Phone is OFF or number is different");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}

}



