package dev.tkdwls9277.algorithm;

import java.util.Scanner;

/**블랙잭(브루트포스)
 * 
*/


public class Algorithm2798 {

	public static void main(String[] args) {
		int count, numberM, memo=0;
		int[] numberN;
		
		Scanner s = new Scanner(System.in);
		
		count = s.nextInt();
		numberM=s.nextInt();
		numberN=new int[count];
		for(int i=0;i<numberN.length;i++) {
			numberN[i]=s.nextInt();
		}
		for(int j=0;j<numberN.length;j++) {
			for(int k=j+1;k<numberN.length;k++) {
				for(int h=k+1;h<numberN.length;h++) {
					if(numberN[j]+numberN[k]+numberN[h]<=numberM && numberN[j]+numberN[k]+numberN[h]>=memo) {
						
						memo=numberN[j]+numberN[k]+numberN[h];
					}
				}
			}
		}
		System.out.println(memo);
		
		s.close();
	}
}
