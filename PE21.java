package ProjectEuler;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;



public class PE21 {

	/**
	 * @param args
	 */
	public static int calcular(int x) {
		Vector<Integer> nums = new Vector<Integer>();
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				nums.add(i);
			}
		}
		int suma = 0;
		for (int j = 0; j < nums.size(); j++) {
			suma += nums.get(j);
		}		
		return suma;
	}
	public static void main(String[] args) {		
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int f = 1; f < 10000; f++) {
		if (calcular(f) >= 1 && calcular(f) < 10000) {
			if (calcular(calcular(f)) == (f)&& (calcular(calcular(f)) != calcular(f))) {
					nums.add(f);
					nums.add((calcular(f)));			
				}
			}
		}
		Iterator<Integer> iter = nums.iterator();
		int sumar = 0;
		while (iter.hasNext()) {
			sumar += iter.next();
		}
		System.out.println(sumar);
		
	}

}
