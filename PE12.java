package ProjectEuler;

public class PE12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x =700;
	int nums[] = new int[x];
	for (int i = 0; i< nums.length; i++){
		nums[i]=(i+1);
	}

	int numsTriangulo[] = new int[x];

	for (int j = 0; j < numsTriangulo.length; j++) {
		if (j == 0) {
			numsTriangulo[j] = (j + 1);

		} else {
			numsTriangulo[j] = ((j + 1) + numsTriangulo[j - 1]);
			//System.out.println(numsTriangulo[j]);
		}
	}
	String salida="";
	for (int w = 0; w< numsTriangulo.length;w++){
	
		
			salida+=" "+numsTriangulo[w]+" ";
		}
System.out.println(salida);	
int numF[] = new int[x];
	boolean romper =false;

	for (int i=0; i< numsTriangulo.length; i++ ){
		for (int k=0; k< nums.length ; k++){
			if (numsTriangulo[i]%nums[k]==0){
				numF[i]++;
				
			}
		}
	}
	String salida3="",salida4="";
	for (int w = 0; w< numF.length&& romper == false;w++){
		salida4+= " "+numF[w]+" ";
		if (numF[w]==576){
			salida3+=" "+numsTriangulo[w]+" ";
			romper=true;
		}
		
	}
	System.out.println(salida4);
	System.out.println(salida3);
	}

}

