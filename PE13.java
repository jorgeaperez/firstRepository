package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;



public class PE13 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner entrada = new Scanner(new File("PE13text.txt"));

		ArrayList<String> digitos = new ArrayList<String>();
		
		while (entrada.hasNext()) {
			String s = new String(entrada.next());
		if(digitos.size()<100){
			digitos.add(s);
		}
		}
		
		
		
		BigInteger suma = BigInteger.ZERO;
		for (int i = 0; i < digitos.size(); i++) {
			BigInteger num = new BigInteger(digitos.get(i));
			suma = suma.add(num);

		}

		String salida = "";
		salida += suma;
		System.out.println(salida.substring(0, 10));

		
	}

}
