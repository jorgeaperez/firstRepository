	package ProjectEuler;


import java.math.BigInteger;
import java.util.Scanner;

public class PE10 {

	public static void main(String[] args) {
		// LA LOGICA FUNCIONA PERO EL PROGRAMA SE DEMORA DEMACIADO EN DAR LA RESPUESTA
		// DEMACIADO INEFICIENTE!!!
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el numero");
		int x = entrada.nextInt(), cont = 0;
		
		int nums[] = new int[x];
		for (int i = 1; i <= x; i++) {

			nums[i - 1] = (i + 1);
			if (x % i == 0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("Es primo!");
		} else {
			if (cont > 2)
				System.out.println("NO lo es");
		}

		int numP[] = new int[x];
		int contP[] = new int[x];
		for (int j = 0; j < nums.length; j++) {

			for (int k = 1; k <= nums[j]; k++) {
				if (nums[j] % (k) == 0) {
					contP[j]++;
					System.out.println(nums[j]);
				}
			}
			if (contP[j] == 2) {
				// System.out.println("Es primo!"+nums[j]);
				numP[j] = nums[j];
			} else {
				if (contP[j] > 2) {
					// System.out.println("NO lo es"+ nums[j]);
				}
			}
		}

	//	int primosAnteriores[] = new int[x];
		for (int w = 0; w < contP.length; w++) {
			if (contP[w] == 2) {
				//salida += "*" + nums[w] + "*";
				numP[w]= nums[w];
			}

		}
	//	System.out.println("°°°Los primos anteriores son: " + salida);
		
	
		BigInteger  suma	=new BigInteger("0");
			
			for (int h = 0; h < numP.length; h++) {
				
			
				if (numP[h] != 0 && numP[h]< x) {
					suma = suma.add(new BigInteger(""+numP[h]));
				}
	}
			System.out.println("La suma es "+suma);
		}
}
