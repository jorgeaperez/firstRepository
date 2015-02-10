package ProjectEuler;

import java.math.BigInteger;


public class PE48 {

	public static void main(String args[]) {

		int expo = 1000;
		BigInteger num1 = new BigInteger("1");
		BigInteger suma = new BigInteger("0");
		for (int i = 1; i <= expo; i++) {
		
		//suma = suma.add(new BigInteger(""+i).pow(i));	
		for (int j = 1; j <= i; j++) {
            num1 = num1.multiply(new BigInteger(""+i));
			}
			
			suma= suma.add(num1);
			num1= (num1.multiply(new BigInteger("0"))).add(new BigInteger("1"));
		}
		System.out.println(suma.toString().substring(suma.toString().length()-10, suma.toString().length()));
		System.out.println(suma.toString().length());
		

		
	}
}
