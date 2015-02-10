package ProjectEuler;

import java.math.BigInteger;

public class PE20 {

	
	public static void main(String[] args) {
	int x = 100;
	int nums []= new int [x];
	for (int i =0; i < nums.length;i++){
		nums[i]= (i+1);
	}
	BigInteger acum = new BigInteger("1");
	for(int w =0; w < nums.length; w++){
		acum= acum.multiply(new BigInteger(""+nums[w]));
	}
	String salida ="";
	salida+=acum;
	int total=0;
	for (int j = 0; j < salida.length(); j++){
		total+= ((int ) salida.charAt(j)-48);
	}
	
	System.out.println("ACUM "+ acum);
	System.out.println("Total "+ total);
	}

}
