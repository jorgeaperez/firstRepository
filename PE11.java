package ProjectEuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PE11 {
	

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @th20 FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException  {
		Scanner entrada = new Scanner(new File("PE11.txt"));
		int nums [][] = new int [20][20];
		for (int i=0;i<20;i++){
			for(int j =0;j<20;j++){
				nums[i][j] =entrada.nextInt();
			}
		}
		
		   	
		int greatest=0;
			
		for (int  r = 0; r < 20; r++){
		    for (int  c = 0; c < 20; c++)
		    {
		        if (c < 20 - 3)
		        {
		            // Right and "Left"
		            if (greatest < nums[r][c] * nums[r][c+1] * nums[r][c+2] * nums[r][c+3])
		                greatest = nums[r][c] * nums[r][c+1] * nums[r][c+2] * nums[r][c+3];
		        }

		        if (r < 20 - 3)
		        {
		            // Down and "Up"
		            if (greatest < nums[r][c] * nums[r+1][c] * nums[r+2][c] * nums[r+3][c])
		                greatest = nums[r][c] * nums[r+1][c] * nums[r+2][c] * nums[r+3][c];

		            // Diagonally][ down to the right
		            if (c < 20 - 3)
		                if (greatest < nums[r][c] * nums[r+1][c+1] * nums[r+2][c+2] * nums[r+3][c+3])
		                    greatest = nums[r][c] * nums[r+1][c+1] * nums[r+2][c+2] * nums[r+3][c+3];

		            // Diagonally][ down to the left
		            if (c > 3)
		                if (greatest < nums[r][c] * nums[r+1][c-1] * nums[r+2][c-2] * nums[r+3][c-3])
		                    greatest = nums[r][c] * nums[r+1][c-1] * nums[r+2][c-2] * nums[r+3][c-3];
		        }
		    }
			System.out.println(greatest);
	
		
	
	}
	
		
		String salida="";
		for(int w =0;w<20;w++){
			for(int k =0;k<20;k++){
				salida+="\t"+nums[w][k]+"";
			}
			salida+="\n";
		}
		
	
		System.out.println(salida);
}
}