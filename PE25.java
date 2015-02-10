package ProjectEuler;
import java.math.BigInteger;

public class PE25 {

public static void main(String[] args) {	
		BigInteger x= new BigInteger("1");
		BigInteger y = new BigInteger("0");	
		int cont=0;
		boolean encontrado = false;
		while(x.toString().length()<=1000 && encontrado==false )	{			
			x= x.add(y);				
			y = x.subtract(y);
			cont++;
			if(x.toString().length()==1000){
				encontrado=true;
			}
		}	
		System.out.println(cont+1);
	}

}
