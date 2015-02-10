
import java.Math.BigInteger;


public class GenerarPrimes {

	public static void main(String[] args) {
		
		boolean primos[] = new boolean[10000];
		for (int e = 0; e < primos.length; e++) {
			primos[e] = true;
		}
		for (int i = 2; i < (int) (Math.sqrt(primos.length) + 1); i++) {
			if (primos[i] == true) {
				for (int j = i*i; j < primos.length; j += i) {
					if (j != i) {
						primos[j] = false;
					}
				}

			}
		}
		
		System.out.println(primos.length);
		BigInteger suma = new BigInteger("1");
		int cont =0;
		for (int w = 2; w < primos.length; w++) {
			if (primos[w] == true) {
				
				suma = suma.add(new BigInteger("" + w));
				//System.out.println(w);
				cont++;
			}
			
		}
		System.out.println(cont);
		System.out.println(suma);
		
		

		
	}

}
