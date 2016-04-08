package algebra.polinomio;

import java.util.ArrayList;
import java.util.List;

public class Termino{
	static int N = Variables.N;
	int coeficiente;
	List<Integer> monomio;
	
	public Termino(int coeficiente, List<Integer> monomio){
			this.coeficiente=coeficiente;
			this.monomio=new ArrayList<Integer>();
			for(int i=0;i<N;i++){
				this.monomio.add(monomio.get(i));
			}
	}
	@Override
	public String toString(){
		String cadena=""+coeficiente+"*[";
		for(int i=0;i<N-1;i++){
			cadena=cadena+this.monomio.get(i)+",";
		}
		cadena=cadena+this.monomio.get(N-1)+"]";
		return cadena;
		
	}
	
	public static Termino sumar(Termino s1, Termino s2){
		if(s1.monomio.equals(s2.monomio)){
			return new Termino(s1.coeficiente+s2.coeficiente, s1.monomio);
		}else{
			return null;
		}
	}
	
	public static Termino restar(Termino s1, Termino s2){
		if(s1.monomio.equals(s2.monomio)){
			return new Termino(s1.coeficiente-s2.coeficiente, s1.monomio);
		}else{
			return null;
		}
	}

	public static int compare(Termino t0, Termino t1) {//Orden lexicografico

		
		for(int i=0;i<N;i++){
			if(t0.monomio.get(i)!=t1.monomio.get(i)){
				return t0.monomio.get(i)-t1.monomio.get(i);
			}
		}
		return 0;
		
	}
	
	
}
