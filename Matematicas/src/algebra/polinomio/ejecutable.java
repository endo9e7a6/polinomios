package algebra.polinomio;

import java.util.ArrayList;
import java.util.List;

public class ejecutable {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(0);
		lista.add(2);
		Termino term1 = new Termino(3,lista);
		
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(1);
		lista2.add(1);
		lista2.add(2);
		Termino term2 = new Termino(5,lista2);
		
		List<Integer> lista3 = new ArrayList<Integer>();
		lista3.add(1);
		lista3.add(0);
		lista3.add(2);
		Termino term3 = new Termino(7,lista3);
		
		
		
		System.out.println(Termino.compare(term2, term3));

	}

}
