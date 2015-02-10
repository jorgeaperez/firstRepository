package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PE18 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner archivo=new Scanner(new File("triangulo.txt"));
		int col = archivo.nextInt();
		int fila = archivo.nextInt();

		int matriz[][] = new int[fila][col];
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j=1;j<matriz[i].length&&archivo.hasNext() == true;j++){					
					if(j<i||j==i){
//						matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Numero "));;
						matriz[i][j]=archivo.nextInt();
					}
				
			}
		}	
		int matrizb[][]=matriz;
		for (int i = 0; i < matrizb.length; i++) {
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matrizb[i][j]+"\t");			
			}
			System.out.print("\n");
		}
		
		for (int i = 1; i < matrizb.length; i++) {
			for(int j=1;j<matrizb[i].length;j++){
				matrizb[i][j]=matriz[i][j]+Math.max(matrizb[i-1][j], matriz[i-1][j-1]);		
	
			}
			System.out.print("\n");
		}
		for (int i = 0; i < matrizb.length; i++) {
			for(int j=0;j<matrizb[i].length;j++){
				System.out.print(matrizb[i][j]+"\t");			
			}
			System.out.print("\n");
		}
		int cont =0;
		for(int i =0;i<101;i++){
			if(cont<matrizb[matrizb.length-1][i]){
				cont=matrizb[matrizb.length-1][i];
			}
		}
		System.out.println(cont);

		
}

}
