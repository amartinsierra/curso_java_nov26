package main;

public class ProbarArrays {
	void main() {
		int[] nums= {4,9,-1,11,6};
		//suma el contenido del array
		int suma=0;
		for(int i=0;i<nums.length;i++) {
			suma+=nums[i];
		}
		System.out.println("La suma es "+suma);
				
	}
}
