package ProjectEuler;

public class PE28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int con = 0, suma = 0, j = 1, c = 2;
		while (j < 1001 * 1001) {
			if (con != 4) {
				j += c;
				suma += j;
				con++;
			} else {
				c += 2;
				con = 0;
			}
		}
		System.out.println(suma + 1);

	}

}
