package ProjectEuler;

import java.math.BigInteger;

public class PE14 {

	public static BigInteger calcular(BigInteger n) {
		int pasos = 0;

		while ((n.equals(new BigInteger("1")) == false)) {

			if ((n.mod(new BigInteger("2"))).equals((new BigInteger("0")))) {
				n = (n.divide(new BigInteger("2")));
				pasos++;
			} else {
				n = (n.multiply(new BigInteger("3"))).add(new BigInteger("1"));
				pasos++;
			}

		}

		return new BigInteger("" + (pasos + 1));
	}

	public static void main(String[] args) {
		long ini = System.currentTimeMillis();
		BigInteger calcular[] = new BigInteger[2];
		calcular[0] = new BigInteger("0");
		calcular[1] = new BigInteger("0");
		for (int i = 2; i < 100000; i++) {

			if (calcular(new BigInteger("" + i)).compareTo(calcular[0]) == 1) {

				calcular[0] = calcular(new BigInteger("" + i));
				calcular[1] = new BigInteger("" + i);

			}
		}
		long fina= System.currentTimeMillis();
		System.out.println(calcular[1]);
		System.out.println(calcular[0]);
		System.out.println(fina-ini);
		BigInteger b = BigInteger.ZERO;
		b = b.nextProbablePrime();
		System.out.println(b);
	}

}
