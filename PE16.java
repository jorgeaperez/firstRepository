package ProjectEuler;
import java.math.BigInteger;;
public class PE16 {

	public static void main(String[] args) {
		int x = 1000;
		
		
		BigInteger acum= new BigInteger("2");

	
		
		for (int i=0; i <x ; i ++){
		//acum = acum.multiply( new BigInteger (""+2));
			
		}
		acum =acum.pow(1000);
		String salida="";
		salida +=acum;
		int total=0;
		for (int w=0; w< salida.length(); w++){
			total+= ((int) salida.charAt(w)-48);
		}
		System.out.println("num "+ acum);	
		System.out.println("total "+ total);

	}

}
