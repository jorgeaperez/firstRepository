package ProjectEuler;

import java.math.BigInteger;


public class PE30 {

	/**
	 * @param args
	 */
	
	public static boolean calcular (String n){
		
		BigInteger num1 = new BigInteger("1");
		BigInteger suma = new BigInteger("0");
		
		for (int i = 1; i <= n.length(); i++) {
			num1 = num1.multiply(new BigInteger(""+(n.charAt(i-1)-48)).pow(5));
			
			suma =suma.add( num1);
			num1= num1.multiply(new BigInteger("0")).add(new BigInteger("1"));
		}
		if(suma.equals(new BigInteger(n))==true){
			return true;
		}else{
			return false;
		}
		
	}
	public static void main(String[] args) {
		BigInteger suma = new BigInteger("0");
		
		int sum =0;
		for(int i =1; i<= 5*(Math.pow(9, 5));i++){
			if(calcular(""+i)==true){
				suma =suma.add(new BigInteger(""+i));
				sum +=i;
			}
		}
		System.out.println(sum-1);
		System.out.println(suma.subtract(new BigInteger("1")));
	}

}
