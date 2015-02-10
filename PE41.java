package ProjectEuler;


import java.util.ArrayList;
import java.util.Collections;

public class PE41 {

	public static boolean calcularPandigital(String n, int n2) {

		boolean es = false;
		boolean romper = false;

		ArrayList<Integer> pan = new ArrayList<Integer>();
		for (int w = 0; w < n2; w++) {
			pan.add(w + 1);
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
		ArrayList<Integer> nums = new ArrayList<Integer>();

		boolean primos[] = new boolean[20000000];
		for (int e = 0; e < primos.length; e++) {
			primos[e] = true;
		}
		for (int i = 2; i < (int) (Math.sqrt(primos.length) + 1); i++) {
			if (primos[i] == true) {
				for (int j = i; j < primos.length; j += i) {
					if (j != i) {
						primos[j] = false;
					}
				}

			}
		}

		for (int w = 2; w < primos.length; w++) {
			if (primos[w] == true) {

				nums.add(w);

			}

		}

		Collections.reverse(nums);

		for (int w = 0; w < nums.size(); w++) {
			if (calcularPandigital(nums.get(w) + "", nums.get(w).toString().length()) == true) {
				System.out.println(nums.get(w));
				break;
			}

		}
		
		

	}

}
