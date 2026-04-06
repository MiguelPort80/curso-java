package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.Funcionarios;

public class Programa {

	public static void main(String[] args) {
		List<Funcionarios> lista = new ArrayList<>(); 
		Funcionarios fun1 = new Funcionarios(373, "Maria Brown", 3000.00);
		Funcionarios fun2 = new Funcionarios(444, "Alex gray", 5200.00);

		lista.add(fun1);
		lista.add(fun2);
		IO.println(lista.get(0).aumentarSalario(10));
		for (Funcionarios funcionario : lista) {
			IO.println(funcionario);
		}
	}

}
