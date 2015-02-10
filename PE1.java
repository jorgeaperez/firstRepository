package ProjectEuler;
import java.util.*;
public class PE1 {
public static void main (String args[]){
	Scanner entrada = new Scanner(System.in);
	System.out.println("ingrese el numero");
	int x = entrada.nextInt();


	int nums[]= new int [x];
	int Sumn[]= new int [x];
	for (int i=1; i< nums.length; i ++){
		nums[i]=(i);
	}
	for (int k =0; k < nums.length; k ++){
		if (nums[k]%3==0|| nums [k]%5==0){
			
			Sumn[k]=nums[k];
		
		}
	
	}
	int total=0;
	for (int w = 0;w<Sumn.length;w++){
		
		total+=Sumn[w];
			
			
	
	}
	System.out.println(total);
}
}
