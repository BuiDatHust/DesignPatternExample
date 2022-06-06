package FactoryMethod;

public class BankFactory {
	
	public Bank getBank(BankType type) {
		switch(type) {
			case MBBANK :
				return new MBBank() ;
			case TPBANK :
				return new TPBank() ;
			default:  
				throw new IllegalArgumentException("Type Bank is not corect"); 
		}
	}
}
