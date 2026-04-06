package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate da1 = LocalDate.now();
		LocalDateTime da2 = LocalDateTime.now();
		Instant da3 = Instant.now();
		
		LocalDate da4 = LocalDate.parse("2026-02-26");
		LocalDateTime da5 = LocalDateTime.parse("2026-02-26T10:38:02");
		Instant da6 = Instant.parse("2026-02-26T10:38:02Z");
		
		LocalDate da7 = LocalDate.parse("26/02/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		IO.println(da1);
		IO.println(da2);
		IO.println(da3);
		IO.println(da4);
		IO.println(da5);
		IO.println(da6);
		IO.println(da7);
	}

}
