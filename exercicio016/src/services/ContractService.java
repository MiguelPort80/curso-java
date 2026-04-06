package services;


import java.util.ArrayList;

import entities.Contract;
import entities.Installment;
public class ContractService {
	public ContractService() {}
	
	public static void processContract(Contract contract, Integer months, OnlinePaymentService ops) {
		
		ArrayList<Installment> installments = new ArrayList<Installment>();
		
		Double splited = contract.getTotalValue() / months;

		for(int i = 1; i < months+1; i++) {

			Double interest = ops.interest(splited, i);
			Double total = splited + interest;

			Double paymentFee = ops.paymentFee(total);
			total += paymentFee;
			
			
			installments.add(new Installment(contract.getDate().plusMonths(i), total));
			
		}
		
		contract.setInstallments(installments);
	}
}
