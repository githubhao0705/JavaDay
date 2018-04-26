package homeWork5;

public class HomeWork5_39 {
	public static void main(String[] args) {
		System.out.println(computeCommission(252500));
	}
	
	public static double computeCommission(double salesAmount) {
		double money=0;
		
		if (salesAmount<=5000) {
			money=salesAmount*0.08;
		}else if (salesAmount<=10000) {
			money=(salesAmount-5000)*0.1+5000*0.08;
		}else {
			money=(salesAmount-10000)*0.12+5000*0.1+5000*0.08;
		}
		return money;
	}
}
