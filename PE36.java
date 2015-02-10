package ProjectEuler;


import java.util.ArrayList;

public class PE36 {
	public static boolean palindromo(String palin) {
		
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
public static void main (String args[]){
	ArrayList <Integer> palindromos = new ArrayList<Integer>();
	for(int i =0; i<1000000;i++){
		if(((palindromo(i+""))==false)){
			palindromos.add(i);
		}	
	}	
	long suma=0;
	for(int j=0;j<palindromos.size();j++){
		if(palindromo(Integer.toBinaryString(palindromos.get(j)))==false){
			suma+=palindromos.get(j);
		}
	}
	System.out.println(suma);
}
}
