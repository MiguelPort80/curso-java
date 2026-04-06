package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "/tmp/teste";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				IO.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			IO.print("Error: "+ e.getMessage());
		}
	}

}
