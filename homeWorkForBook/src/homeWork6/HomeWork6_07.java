package homeWork6;

import java.util.Scanner;

import homeWork2.HomeWork2_21;

public class HomeWork6_07 extends HomeWork2_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested:");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate:");
		double monthlyInterestRate = input.nextDouble();
		
		System.out.println("Years\t\tFuture Value");
		double temp=0;
		for (int i = 1; i <= 30; i++) {
			System.out.print(i+"\t\t");
			temp=new HomeWork6_07().futureInvestmentValue(investmentAmount, monthlyInterestRate, 1);
			System.out.println((int)(temp*100)/100.0);
			investmentAmount =temp;
		}
	}

	@Override
	public double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		// TODO Auto-generated method stub
		return super.futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
	}

	public void show() {

	}
}
