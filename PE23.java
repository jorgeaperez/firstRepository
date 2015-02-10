package ProjectEuler;

import java.util.*;

public class PE23 {
	public static int calcular(int x) {
		int devolver = 0;
		int suma = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				suma += i;
			}
		}
		if (suma == x) {
			// System.out.println("Numero perfecto");
			devolver = 0;

		}
		if (suma < x) {
			// System.out.println("Deficiente");
			devolver = -1;
		}
		if (suma > x) {
			// System.out.println("Abundante");
			devolver = 1;
		}
		return devolver;
	}

	public static void main(String[] args) {
		ArrayList<Integer> Ab = new ArrayList<Integer>();
		for (int i = 0; i < 28123; i++) {
			if (calcular(i) == 1) {
				Ab.add(i);
			}
		}


		HashSet<Integer> sumas = new HashSet<Integer>();
		for(int i=0;i<=28123;i++ ){
			sumas.add(i);
		}
			
		for(int k=0;k<Ab.size();k++){
			for (int j = 0; j <Ab.size() ; j++) {
				if( (Ab.get(k)+Ab.get(j))>0 &&  (Ab.get(k)+Ab.get(j))<=28123 ){
				 sumas.remove((Ab.get(k)+Ab.get(j)));
				
				}else{
					break;
				}
			}
		}
		long suma = 0;
		Iterator<Integer> iterator = sumas.iterator();
		while(iterator.hasNext()){
			suma+=iterator.next();
		}
		System.out.println(suma);
	}
}
