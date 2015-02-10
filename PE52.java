package ProjectEuler;

public class PE52 {

	/**
	 * @param args
	 */
	public static boolean calcular(String n, String n2) {

		boolean es = false;
		boolean romper = false;
		
		if(n.length()!=n2.length()){
			return false;
		}else{
				for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < n2.length() && romper == false; j++) {

				if (n.charAt(i) == n2.charAt(j)) {
					es = true;
					break;
				} else {
					es = false;

				}
			}
			if (es == true) {
				es = true;
			} else {
				es = false;
				romper = true;
			}
		}
				
		return es;
		}
	}

	public static void main(String[] args) {

		
		for (int i = 1; i <= 1000000; i++) {
			if (calcular(i + "", i * 2 + "") == true) {
				if (calcular(i + "", i * 3 + "") == true) {
					if (calcular(i + "", i * 4 + "") == true) {
						if ((calcular(i + "", i * 5 + "") == true)) {
							if ((calcular(i + "", i * 6 + "") == true)) {
							System.out.println(i);
							}
						}
					}
				}
			}
		}

	}
}