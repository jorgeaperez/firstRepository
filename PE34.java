package ProjectEuler;

import java.math.BigInteger;

public class PE34 {

	/**
	 * @param args
	 */
	public static boolean calcular(String n) {

		BigInteger suma = new BigInteger("0");
		BigInteger factorial = new BigInteger("1");
		for (int i = 0; i < n.length(); i++) {

			for (int j = 1; j <= (n.charAt(i) - 48); j++) {
				factorial = factorial.multiply(new BigInteger("" + j));
			}
			suma = suma.add(factorial);
			factorial = factorial.multiply(new BigInteger("0")).add(
					new BigInteger("1"));

		}

		if (suma.equals(new BigInteger(n))) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		BigInteger suma = new BigInteger("0");
		for (int k = 3; k <= 40731; k++) {
			String n = k + "";
			if (calcular(n) == true) {
				suma = suma.add(new BigInteger(n));
			}
			n = "";
		}
		System.out.println(suma);

	}

}
