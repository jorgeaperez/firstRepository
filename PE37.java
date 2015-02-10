package ProjectEuler;

import java.util.HashSet;
import java.util.Iterator;



public class PE37 {
	
	public static boolean prime(int n) {
	  
	return !new String(new char[n]).matches(".?|(..+?)\\1+");
	  
}
public static boolean esTrunc(Integer x){
	
	int c =10;
	boolean es = true;
		for(int f=0;f<x.toString().length()-1;f++){
			
			//System.out.println(x);
		
			if(prime(x/c)==true){
				c*=10;	
				//System.out.println(x/c);
			}else{
				es=false;
				break;
			}
			
		}
return es;
	
}
public static boolean esTruncMod(Integer x){
	
	int c =10;
	boolean es = true;
		for(int f=0;f<x.toString().length()-1;f++){
			
			//System.out.println(x);
		
			if(prime(x%c)==true){
				c*=10;	
				//System.out.println(x/c);
			}else{
				es=false;
				break;
			}
			
		}
return es;
	
}
	public static void main(String[] args) {
		boolean primos[] = new boolean[2000000];
		for (int e = 0; e < primos.length; e++) {
			primos[e] = true;
		}
		for (int i = 2; i < (int) (Math.sqrt(primos.length) + 1); i++) {
			if (primos[i] == true) {
				for (int j = i; j < primos.length; j += i) {
					if (j != i) {
						primos[j] = false;
						
					}
				}

			}
		}
		
	
	HashSet<Integer> nums = new HashSet<Integer>();
		for (Integer w = 11; w < primos.length; w=w+1) {
			if (primos[w] == true) {
				if(nums.size()!=11){
				if(esTruncMod(w)){
					if(esTrunc(w)==true){
						
				
							nums.add(w);
							System.err.println(w);
							}
						}
						
				}else{
					break;
				}
				
			}
		}
		Iterator<Integer> iter= nums.iterator();
		long suma=0;
		while(iter.hasNext()){
			suma+=iter.next();
		}
		System.err.println(suma);
		

	}

}
