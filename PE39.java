package ProjectEuler;

import java.util.ArrayList;

public class PE39 {

	public static int calcular(int h) {

		ArrayList<Numero> n = new ArrayList<Numero>();

		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j <= 500; j++) {
				for (int k = 1; k < 500; k++) {
					if ((i + j + k) == h) {

						n.add(new Numero(i, j, k));
					}
				}
			}
		}

		ArrayList<Numero> n2 = new ArrayList<Numero>();
		for (int w = 0; w < n.size(); w++) {
			if ((n.get(w).x) * (n.get(w).x) + (n.get(w).y) * (n.get(w).y) == (n.get(w).z) * (n.get(w).z)) {

				n2.add(new Numero(n.get(w).x, n.get(w).y, n.get(w).z));
			}
		}
		return (n2.size() / 2);

	}

	public static void main(String[] args) {
		long ini = System.currentTimeMillis();
		int cont = 0;
		int contI = 0;
		for (int i = 1; i <= 1000; i++) {
			if (calcular(i) > cont) {
				cont = calcular(i);
				contI = i;
			}
			System.out.println(i);
		}
		System.err.println(cont);
		System.err.println(contI);
		System.out.println(System.currentTimeMillis() - ini);

	}

}
