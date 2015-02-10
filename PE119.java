package ProjectEuler;

public class PE119 {
	public static void main(String args[]) {
		Integer x = 512, suma = 0;

		for (int i = 0; i < x.toString().length(); i++) {
			suma += Integer.parseInt(x.toString().charAt(i) + "");
		}

		System.out.println(suma);

	
		
	}
}
