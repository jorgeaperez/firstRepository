package ProjectEuler;

import java.util.ArrayList;

import java.util.Collections;

public class PE4 {
	public static boolean palindromo(int num) {
		String palin="";
		palin+=num;
		int contInicial = 0;
		int contFinal = palin.length() - 1;
		boolean noPalindromo = false;
		for (int i = 0; i < (int) palin.length() / 2 && noPalindromo == false; i++) {
			if (palin.charAt(contInicial) == palin.charAt(contFinal)) {
				contInicial++;
				contFinal--;
				} else {
				noPalindromo = true;
				break;

			}
		}
		return noPalindromo;
	}
	
	

	public static void main(String args[]) {
		long ini = System.currentTimeMillis();
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		for (int i = 1; i <= 999; i++) {
			nums1.add(i);
			nums2.add(i);
		}

		
		ArrayList<Integer> multipli = new ArrayList<Integer>();
		for (int i = nums1.size() - 1; i >= 0; i--) {
			
			for (int j = nums2.size() - 1; j >= 0; j--) {
				
				multipli.add(nums1.get(i) * nums2.get(j));
			
			}
		}
		
		Collections.sort(multipli);
		Collections.reverse(multipli);
		
		for (int k = 0; k < multipli.size(); k++) {
			
			if(palindromo(multipli.get(k))==false){
			System.out.println(multipli.get(k));
		
			break;
			}
		}
		
		long fina = System.currentTimeMillis();
		System.out.println(fina-ini);

	}

}
