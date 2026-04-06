package aplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class Program {

	public static void main(String[] args) {
		Contract cc = new Contract();
		Scanner sc = new Scanner(System.in);
		IO.println("Entre os dados do contato: ");
		IO.print("Numero: ");
		cc.setNumber(sc.nextInt());
		IO.print("Data (dd/MM/yyyy): ");
		String aux = sc.next();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(aux, formato);
		cc.setDate(date);
		IO.print("Valor do contrato:");
		cc.setTotalValue(sc.nextDouble());
		IO.print("Entre com o número total de parcelas:");
		Integer months = sc.nextInt();
		
		PayPalService pps = new PayPalService();
		ContractService.processContract(cc, months, pps);

		IO.println("Parcelas");
		ArrayList<Installment> installment = cc.getInstallments();
		for (Installment element : installment) {
			IO.println(element.getDueDate() + " - " + element.getAmount() );
		}
	}

}
