package ProjectEuler;
import java.util.*;
public class PE35 {

	public static void main(String[] args) {
		boolean primos[] = new boolean[1000000];
		for (int i = 0; i < primos.length; i++) {
			primos[i] = true;
		}
		for (int j = 2; j < (int) (Math.sqrt(primos.length) + 1); j++) {
			if (primos[j] == true) {

				for (int k = j; k < primos.length; k += j) {
					if (k != j) {
						primos[k] = false;
					}
				}

			}

		}
		HashSet<Integer> circularPrimes = new HashSet<Integer>();
		for (Integer w = 2; w < primos.length; w++) {
			if (primos[w] == true) {

				ArrayList<Character> digitos = new ArrayList<Character>();
				for (int i = 0; i < w.toString().length(); i++) {
					digitos.add(w.toString().charAt(i));
				}
				ArrayList<Integer> nums = new ArrayList<Integer>();
				for (int k = 0; k < w.toString().length(); k++) {
					String num = "";
					for (int j = 0; j < digitos.size(); j++) {
						num += Integer.parseInt(digitos.get(j) + "");
					}
					digitos.add(digitos.get(0));
					digitos.remove(digitos.get(0));
					nums.add(Integer.parseInt(num));
				}
				int cont = 0;
				for (int j = 0; j < nums.size(); j++) {
					if (primos[nums.get(j)] == true) {
						cont++;
					}
				}
				if (cont == w.toString().length()) {
					circularPrimes.addAll(nums);

					for (int h = 0; h < nums.size(); h++) {
						primos[nums.get(h)] = false;

					}
				}

				nums.clear();

			}
		}
		System.out.println(circularPrimes.size());

	}

}
