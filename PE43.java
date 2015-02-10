package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PE43 {

	/**
	 * @param args
	 */
	public static boolean calcularPandigital(String n, int n2) {

		boolean es = false;
		boolean romper = false;

		ArrayList<Integer> pan = new ArrayList<Integer>();
		for (int w = 0; w < n2; w++) {
			pan.add(w);
		}

		if (n.length() != n2) {
			return false;
		} else {
			for (int i = 0; i < n.length(); i++) {
				for (int j = 0; j < pan.size() && romper == false; j++) {

					if (Integer.parseInt(n.charAt(i) + "") == pan.get(j)) {
						pan.remove(j);
					}
				}
			}
			if (pan.size() == 0) {
				es = true;
			} else {
				es = false;
			}
			return es;
		}
	}

	public static void main(String[] args) {
		//Ineficiente
		ArrayList<BigInteger> pandigitals = new ArrayList<BigInteger>();
		BigInteger f = new BigInteger("9876543210");
		for(BigInteger i = new BigInteger("1234567890");i.compareTo(f)<1;i = i.add(new BigInteger("1"))){
		
		
			if (calcularPandigital(i + "", 10)) {
				pandigitals.add(i);
				
				

			}
			System.out.println(i);
		}
		HashSet<BigInteger> nums = new HashSet<BigInteger>();
		for (int j = 0; j < pandigitals.size(); j++) {
			String salida = "";
			salida += pandigitals.get(j);

			if ((Integer.parseInt(salida.substring(1, 4)) % 2 == 0)) {
				if ((Integer.parseInt(salida.substring(2, 5)) % 3 == 0)) {
					if ((Integer.parseInt(salida.substring(3, 6)) % 5 == 0)) {
						if ((Integer.parseInt(salida.substring(4, 7)) % 7 == 0)) {
							if ((Integer.parseInt(salida.substring(5, 8)) % 11 == 0)) {
								if ((Integer.parseInt(salida.substring(6, 9)) % 13 == 0)) {
									if ((Integer.parseInt(salida.substring(7,10)) % 17 == 0)) {
										nums.add(pandigitals.get(j));
									}
								}
							}

						}

					}
				}

			}

		}
		
		
		Iterator<BigInteger> iter = nums.iterator();
		BigInteger suma = new BigInteger("0");
		while(iter.hasNext()){
			suma = suma.add(iter.next());
		}
		System.out.println(suma);
	}
}
