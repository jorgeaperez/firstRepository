package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Vector;

public class PE56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<BigInteger> nums = new Vector<BigInteger>();
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {				
				nums.add(new BigInteger("" + i).pow(j));
			}
		}	
		
		System.out.println(nums.size());
		ArrayList <BigInteger> ss= new ArrayList<BigInteger>();
		BigInteger suma3 = new BigInteger("0");
		for (int h = 0; h < nums.size(); h++) {
			for (int f = 0; f < nums.get(h).toString().length(); f++) {
				suma3 = suma3.add(new BigInteger(Integer.parseInt((nums.get(h).toString()).charAt(f)+"")+ ""));
			}
			ss.add(suma3);
			suma3= suma3.multiply(new BigInteger("0"));

		}
		Collections.sort(ss);
		System.out.println(ss.get(ss.size()-1));
		
		
		
		
		
	}
}
