package algebra.polinomio;

import java.util.ArrayList;
import java.util.List;

public class Polinomio {

	List<Termino> terminos;
	
	public Polinomio(){
		terminos = new ArrayList<Termino>();
	}
	public Polinomio(String s) throws Exception{//Ni puto caso a este metodo
		terminos = new ArrayList<Termino>();
		
		char[] charArray = s.toCharArray();
		Termino term;
		
		boolean finaliza=false;
		
		while(!finaliza){
			
		}
		
		
	}
	public void add(Termino term){
		terminos.add(term);
	}
}
