package ProjectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class PE26 {



	public static void main(String[] args) {
		/* 
 using the fact that long cycles are created by prime numbers. So we need to find the greatest prime 
 number p such that 1/p has a big cycle's length. So we first know that we will iterate on primes 
 numbers starting from 997 (999 and 998 are obviously not primes). When we found a prime number, 
 we know that p - 1 will be the cycle length, or a multiple of the cycle length ! So for
  each length l so that 1 <= l < p, we must find the minimal cycle length l. For this, we can use this
  formula: 10^l mod p = 1.
		  
		 */
		long time = System.currentTimeMillis();
		BigInteger TEN = BigInteger.valueOf(10), cycle = BigInteger.valueOf(142857);
		int res = 7, maxCycleLength = 6;
		// for each prime numbers, starting at the maximum possible value (999
		// and 008 are not primes)
		for (int p = 997; p > 7; p -= 2) {
			if (BigInteger.valueOf(p).isProbablePrime(100)) {
				// if p is prime, we check the least number that satisfy 10^l
				// mod p = 1
				for (int l = 1; l < p; l++) {
					BigInteger[] qr = TEN.pow(l).divideAndRemainder(
							BigInteger.valueOf(p));
					// qr[0] is the quotient. It is also equals to the cycle of
					// 1/p
					// qr[1] is the remainder.
					if (qr[1].equals(BigInteger.ONE)) {
						// we found the length l of the cycle of 1/p
						System.out.println("1/" + p
								+ " has a recuring cycle length of " + l + ": "
								+ leftPad(qr[0].toString(), l, '0'));
						System.out.println("1/"
								+ p
								+ " = "
								+ BigDecimal.ONE.divide(BigDecimal.valueOf(p),
										2000, RoundingMode.HALF_UP));
						// we save these values if the current cycle is greater
						if (maxCycleLength < l) {
							maxCycleLength = l;
							res = p;
							cycle = qr[0];
						}
						break;
					}
				}
			}
		}
		System.out.println("=== RESULT ===");
		System.out.println("1/" + res + " has a recuring cycle length of "
				+ maxCycleLength + ": "
				+ leftPad(cycle.toString(), maxCycleLength, '0') + " in "
				+ (System.currentTimeMillis() - time) + "ms");
		System.out.println(BigDecimal.ONE.divide(BigDecimal.valueOf(res), 2000,
				RoundingMode.HALF_UP));

	}

	private static String leftPad(String string, int l, char c) {
		
		return null;
	}

}
