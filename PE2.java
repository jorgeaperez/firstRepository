package ProjectEuler;

import java.util.Scanner;
import java.math.BigInteger;;

public class PE2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escriba el numero de dijitos ");
		int n = entrada.nextInt();
		int x=1, y=1;
	
		String salida = "";
		BigInteger suma =new BigInteger("0");

		int nums[]= new int [n];
		for  (int i =0;i<n;i++)		{
			
			nums[i]=x;
			
			
			x+=y;	
			
			y = x - y;
		
		
		
		}
		
		
		for (int j=1;j<n;j++){
			
			salida+="*"+nums[j]+"*";
			if(nums[j]%2==0&& nums[j]!=0){
			suma=suma.add(new BigInteger(""+nums[j]));
			}
		}
		
		
		System.out.println(suma);
		System.out.println("*"+salida+"*");
	}

}
