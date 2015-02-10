package ProjectEuler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class PE160 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger f = new BigInteger("1000000000000");
		
		BigInteger i;
		BigInteger factorial = BigInteger.ONE;
		for (i = new BigInteger("1"); f.compareTo(i) == 1
				|| f.compareTo(i) == 0; i = i.add(new BigInteger("1"))) {
			factorial = factorial.multiply(i);
			System.out.println(i);
		}
		FileWriter escribirF=null;
		PrintWriter pw=null;
		try {
		
			escribirF = new FileWriter("C:\\Users\\Acer\\Desktop\\Sistemas 5\\ProjectEuler\\factorial.txt");
			pw = new PrintWriter(escribirF);
			for(int j=0;j<factorial.toString().length();j++){
				pw.print(Integer.parseInt(factorial.toString().charAt(j)+""));
				System.out.println(j);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	           try {
	  	         
		           if (null != escribirF)
		        	  System.out.println("fuking yeah");
		             escribirF.close();
		           
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }
		
		
	}

}
