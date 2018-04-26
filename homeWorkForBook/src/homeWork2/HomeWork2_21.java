package homeWork2;

import java.util.Scanner;

public class HomeWork2_21 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount=input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate=input.nextDouble();
		System.out.print("Enter number of years: ");
		int years=input.nextInt();
		System.out.print("Accumulated value is $"+new HomeWork2_21().futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
	}
	
	public double futureInvestmentValue(double investmentAmount,
			double monthlyInterestRate,int years) {
		return investmentAmount*Math.pow(1+(monthlyInterestRate/100/12), years*12);
	}
}
