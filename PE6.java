package ProjectEuler;
import java.math.*;
public class PE6 {
	public static void main (String args[]){
		
		int numsquares []= new int [100];
		int nums[] = new int [100];
		BigInteger resultado = new BigInteger("0");
		BigInteger resultado2 = new BigInteger("0");
		for (int i = 0 ; i < numsquares.length; i ++){
			numsquares[i]=((i+1)*(i+1));
			nums[i]= (i+1);
		}
	
		for (int k =0; k < nums.length; k++ ){
			resultado2=resultado2.add(new BigInteger(""+numsquares[k]));
			resultado= resultado.add( new BigInteger(""+nums[k]));
			
		}
		resultado = resultado.multiply(resultado);
		
		
		BigInteger solucion= new BigInteger("0");
		
		
		solucion=	resultado.subtract(resultado2);
		System.out.println(solucion);
		
		int numsquares2 []= new int [100];
		int nums2[] = new int [100];
		Integer resultado3 = 0;
		Integer resultado4 = 0;
		for (int i = 0 ; i < numsquares.length; i ++){
			numsquares[i]=((i+1)*(i+1));
			nums[i]= (i+1);
		}
	
		for (int k =0; k < nums.length; k++ ){
			resultado3 = resultado3 + numsquares[k];
			resultado4 = resultado4 + numsquares[k];
		
			
		}
		resultado3 = resultado3*resultado4; 
		
		
		Integer solucion2 = 0;
		
		
		 solucion2=	resultado3-resultado4;
		
		System.out.println(solucion2);
		
	}
}
