package ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class PE47 {

	public static void main(String args[]) {

		boolean primos[] = new boolean[1000000];
		for (int i = 0; i < primos.length; i++) {
			primos[i] = true;
		}

		for (int j = 2; j < (int) Math.sqrt(primos.length) + 1; j++) {
			if (primos[j] == true) {

				for (int k = j; k < primos.length; k += j) {
					if (k != j) {
						primos[k] = false;
					}
				}

			}
		}

		HashSet<Integer> numerosF = new HashSet<Integer>();
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int h = 134000; h <= 135000; h++) {
			int cont = 0;
			for (int w = 2; w < h; w++) {
				if (primos[w] == true) {
					if (h % w == 0) {
						cont++;
					}

					if (cont == 4) {

						numerosF.add(h);

					}
				}
			}
System.out.println(h);
		}
		Iterator<Integer> iter = numerosF.iterator();
		while (iter.hasNext()) {
			nums.add(iter.next());
		}
		Collections.sort(nums);

		// System.out.println(numerosF);

		System.out.println(nums.size());
boolean encontro =false;
		for (int i = 0; i <nums.size()-1&&encontro==false; i++) {
			if (i <= nums.size()-1) {
				if ((nums.get(i+1) - nums.get(i )) == 1) {
					if (i <= nums.size()-2) {
						if ((nums.get(i+2) - nums.get(i )) == 2) {
							if (i <= nums.size()-3) {
								if ((nums.get(i+3) - nums.get(i)) == 3) {

									System.err.println(nums.get(i));
									System.err.println(nums.get(i +1));
									System.err.println(nums.get(i +2));
									System.err.println(nums.get(i + 3));
									encontro =true;
									
								}
							}
							
							
						}
					}

				}
			}
			System.out.println(i);
		}

	}
}
