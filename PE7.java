package ProjectEuler;

public class PE7 {
public static void main (String args[]){
	//boolean primo = false;
	int cont=0,x=105000;
	String salida="";
	int nums[] = new int[x];
	for (int i = 1; i <= x; i++) {

		nums[i - 1] = (i + 1);
		if (x % i == 0) {
			cont++;
		}
	}
	if (cont == 2) {
		System.out.println("Es primo!");
		
		//primo = true;
	} else {
		if (cont > 2)
			System.out.println("NO lo es");
	}
	int numP[] = new int[x];
	int contP[] = new int[x];
	int contPr=0;
	for (int j = 0; j < nums.length; j++) {
		if(contPr!=10001){
		for (int k = 1; k <= nums[j]; k++) {
			if (nums[j] % (k) == 0) {
				contP[j]++;
				
			}
		}
		if (contP[j] == 2) {
			// System.out.println("Es primo!"+nums[j]);
			numP[j] = nums[j];
			contPr++;
		} else {
			if (contP[j] > 2) {
				// System.out.println("NO lo es"+ nums[j]);
			}
		}
		}else{
			break;
		}
	}
System.out.println(contPr);
	int primosAnteriores[] = new int[x];
	for (int w = 0; w < contP.length; w++) {
		if (contP[w] == 2) {
			salida += "*" + nums[w] + "*";
			primosAnteriores[w] = nums[w];
		}

	}
	System.out.println("°°°Los primos anteriores son: " + salida);

}
}
