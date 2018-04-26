package testPhoneCharge;

public class thePhoneIsChargeing {
	public static void main(String[] args) {
		phone myPhone=new phone();
		
		myPhone.brands="ะกรื";
		myPhone.dimensions="11mm*21mm*6mm";
		myPhone.weight="265g";
		
		try {
			myPhone.starChargeing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
