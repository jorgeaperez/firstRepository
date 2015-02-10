package ProjectEuler;

import java.util.ArrayList;

public class PE40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num = "";
		int i = 1;
		while (num.toString().length() <= 1000000) {

			num += i; 	
			
			i++;
		}
	
		ArrayList<Integer> x = new ArrayList<Integer>();

		x.add(Integer.parseInt(num.charAt(0) + ""));
		x.add(Integer.parseInt(num.charAt(9) + ""));
		x.add(Integer.parseInt(num.charAt(99) + ""));
		x.add(Integer.parseInt(num.charAt(999) + ""));
		x.add(Integer.parseInt(num.charAt(9999) + ""));
		x.add(Integer.parseInt(num.charAt(99999) + ""));
		x.add(Integer.parseInt(num.charAt(999999) + ""));
		
		int n = 1;
		for (int j = 0; j < x.size(); j++) {
			n *= x.get(j);
			
		}
		System.err.println(n);

	}

}
