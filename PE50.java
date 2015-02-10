package ProjectEuler;

public class PE50 {

	/**
	 * @param args
	 */
	
	
	public int numPrimosAnteriores(int primo){
		int pasos =0;
		
		
		
		
		
		return pasos;
	}
	public static void main(String[] args) {
		boolean primos [] = new boolean [100];
		
		
		for(int i =2;i<(int)Math.sqrt(primos.length)+1;i++){
			
			for(int j=i*i;j<primos.length;j+=i){
				if(j!=i){
					primos[j]=true;
				}
			}			
		}
		int cont =0;
		for(int w =2;w<primos.length;w++){
			if(primos[w]==false){
				cont++;

			}
		}
System.out.println(cont);
	}

}
