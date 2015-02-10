import java.math.BigInteger;


public class FibonacciWithBIGInteger {

	
	
	public static void main (String arg[]){
	
		
		BigInteger n = new BigInteger("3000000");
		
		
		BigInteger fib = new BigInteger("0");
		
		boolean end =false;
		//for( i=n;i.compareTo(n)>0;i.subtract(new BigInteger("1"))){
			
		while(!end){
				
			fib = fib.add(new BigInteger(""+(n)));
		//	System.out.println("fuck");
			n = n.subtract(new BigInteger("1"));
			if(n.compareTo(new BigInteger("0"))==0){
				end = true;
			}
			
		}
		System.out.println(fib);
		
	}
	
	
	
}
