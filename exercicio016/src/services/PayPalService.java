package services;

public class PayPalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) {
		Double aux = amount;
		aux = (aux * 2)/100;
		
		return aux;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		Double aux = amount;
		aux = (aux * 1)/100;
		aux = aux * months;
		
		return aux;
	}

}
