package ProjectEuler;


public class PE3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean primos[] = new boolean[100000];
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

	double x = 600851475143.0;
		//	double x = 13195.0;
		for (int w = 2; w < primos.length; w++) {
			if (primos[w] == true) {
				
				if(x%w==0){
					System.out.println(w);
				}
				
				
			}

		}

	}

}
}
