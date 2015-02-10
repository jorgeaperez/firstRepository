package ProjectEuler;
import java.math.BigInteger;


public class PE5 {


	public static void main(String[] args) {
		
		
		int nums[]= new int [20];
		int cont =0;
		String salida="";
		for (int i = 1; i <=20; i++) {
			nums[i-1 ] = i;
		}
		
		//int w =200000;
		BigInteger w = new BigInteger("230000000");
		boolean romper=false;
		for (int i = 1; i < nums.length && romper==false;i++){
			
			//if (w % (nums[i])==0){
				if(w.mod(new BigInteger(""+nums[i])).equals(new BigInteger("0"))==true){
				cont ++;
				if (cont==19){
					romper =true;	
					salida+="*"+w+"*";
				
				}
			}else{
				//w++;
				w = w.add(new BigInteger("1"));
				i=0;
				cont=0;
			}
			//System.out.println(w);
			
		}
		
		System.out.println(salida);
			
		
		
		
	}

}
