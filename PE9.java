package ProjectEuler;


import java.util.ArrayList;


public class PE9 {
	public static void main(String args[]) {
	
		ArrayList<NumeroPE9> n = new ArrayList<NumeroPE9>();
		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j <= 500; j++) {
				for (int k = 1; k < 500; k++) {
					if ((i + j + k) == 120) {

						n.add(new NumeroPE9(i, j, k));
					}
				}
			}
		}	
		ArrayList<NumeroPE9> n2 = new ArrayList<NumeroPE9>();
		for (int w = 0; w < n.size(); w++) {
			if((n.get(w).x)*(n.get(w).x)+(n.get(w).y)*(n.get(w).y)==(n.get(w).z)*(n.get(w).z)){
				
				n2.add(new NumeroPE9(n.get(w).x,n.get(w).y,n.get(w).z));				
			}
		}
		System.err.println(n2.size());
		System.out.println(n2.get(0).x);
		System.out.println(n2.get(0).y);
		System.out.println(n2.get(0).z);
		System.out.println(n2.get(1).x);
		System.out.println(n2.get(1).y);
		System.out.println(n2.get(1).z);
		
		System.out.println(n2.get(2).x);
		System.out.println(n2.get(2).y);
		System.out.println(n2.get(2).z);
		
		

	}

	/*
	 * private class numero { int x =0; int y=0; int z =0; public numero (int
	 * x1,int y2,int z3){ x =x1; y=y2; z =z3; }
	 * 
	 * 
	 * }
	 */
}
