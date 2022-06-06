package Facade;

public class ShopFacade {
	private AccountService accountService  ;
	private PaymentService paymentService ;
	private ShippingService shippingService ;
	private EmailService emailService ;
	
	private ShopFacade() {
		accountService = new AccountService() ;
		paymentService = new PaymentService() ;
		shippingService = new ShippingService() ;
		emailService = new EmailService() ;
	}
	
	public ShopFacade getInstance() {
		return ShopHelper.INSTANCE ;
	}
	
	private static class ShopHelper{
		private static final ShopFacade INSTANCE = new ShopFacade() ;
	}
	
	public void byProductByCashFreeShip(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShiping();
		emailService.sendMail(email);
		System.out.println("Buy Product Success!\n");
	}
	
	public void byProductByMomoStandardShip(String email) {
		accountService.getAccount(email);
		paymentService.paymentByMomo();
		shippingService.standardShipping();
		emailService.sendMail(email);
		System.out.println("Buy Product Success!\n");
	}
}
