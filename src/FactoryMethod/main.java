package FactoryMethod;

public class main {
	public static void main(String[] args) {
		Bank newBank = BankFactory.getBank(BankType.MBBANK) ;
		System.out.println(newBank);
	}
}
