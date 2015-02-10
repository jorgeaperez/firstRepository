package ProjectEuler;


import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class PE8 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(new File("1000N.txt"));
		String linea = "";
		while (entrada.hasNext()) {
			linea += entrada.next();
		}
		int cont = 1;
		int contF = 1;
		int contw = 0;
		while (contw < 996) {
			for (int j = contw; j < (contw + 5); j++) {
				cont *= Integer.parseInt(linea.charAt(j) + "");
			}
			contw++;
			if (cont > contF) {
				contF = cont;
			}
			cont = 1;
		}
		System.out.println(contF);
	}

}
