package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PE96 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner entrada = new Scanner(new File("PE96"));
		
		int matriz [][] = new int [9][9];
		
		
		String numero="";
		while(entrada.hasNext()){
			numero+=entrada.next();
				}
		int cont=0;
		for(int i =0;i<9;i++){
			for(int j =0;j<9;j++){
				
				matriz[i][j]=Integer.parseInt(numero.charAt(cont)+"");
				cont++;
				
			}
		}
		
		
		
		
		
		
		String salida ="";
		
		for(int k =0;k<9;k++){
			for(int y =0;y<9;y++){
				
				salida+="\t"+matriz[k][y];
				
				
			}
			salida+="\n";
		}
		
		System.out.println(salida);
		
		
	}

}
