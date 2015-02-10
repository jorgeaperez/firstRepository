package ProjectEuler;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class PE22 {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner entrada = new Scanner(new File("names.txt"));
		int alfabeto[] = new int[26];
		for (int i = 0; i < 26; i++) {
			alfabeto[i] = i + 65;
		}
		ArrayList<String> names = new ArrayList<String>();
		  while (entrada.hasNext()) {
		entrada.useDelimiter(",");
		names.add(entrada.next());
		  	} 
		  Collections.sort(names);
		BigInteger total = new BigInteger("1");
		BigInteger totalT = new BigInteger("0");
		BigInteger totalf = new BigInteger("0");
ArrayList<Character> valorN = new ArrayList<Character>();
		int suma = 0;
		int sumaT=0;
		for (int w = 1; w <= names.size(); w++) {
			for (int i = 0; i < names.get(w-1).toString().length(); i++) {
				if (names.get(w-1).charAt(i) != 34) {
					valorN.add(names.get(w-1).charAt(i));
					for (int k = 0; k < valorN.size(); k++) {
						for (int j = 0; j < 26; j++) {
							if (alfabeto[j] == (int) valorN.get(k)) {
								suma += (j + 1);
					}
						}
						}					
					sumaT+=suma;
					suma=0;
					valorN.clear();
				}
				}
			total = total.multiply(new BigInteger("" + sumaT * w));
			sumaT=0;			
			totalT = total.add(total);
			total=total.multiply(new BigInteger("0")).add(new BigInteger("1"));
			totalf = totalf.add(totalT);		
		}
		System.out.println(totalf.divide(new BigInteger("2")));
		
	}
}
/*

import java.io.*;
import java.util.*;
public class PE22{
public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader(new FileReader("names.txt"));
String input = br.readLine();
String div[] = input.split(",");
ArrayList<String> nombres = new ArrayList<String>();
for(int i=0;i<div.length;i++){
nombres.add(div[i].substring(1,div[i].length()-1));
}
Collections.sort(nombres);
int suma = 0;
for(int i=0;i<nombres.size();i++){
int sumtmp = 0;
for(int j=0;j<nombres.get(i).length();j++){
sumtmp+=(nombres.get(i).charAt(j)-64);
}
suma += sumtmp*(i+1);
}
System.out.println(suma);
}
}
*/