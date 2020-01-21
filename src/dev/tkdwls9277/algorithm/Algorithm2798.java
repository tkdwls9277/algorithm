//블랙잭(브루트포스)

package dev.tkdwls9277.algorithm;

import java.util.Scanner;
public class Algorithm2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, M, memo=0;
		int[] N;
		
		Scanner s = new Scanner(System.in);
		
		count = s.nextInt();
		M=s.nextInt();
		N=new int[count];
		for(int i=0;i<N.length;i++) {
			N[i]=s.nextInt();
		}
		for(int j=0;j<N.length;j++) {
			for(int k=j+1;k<N.length;k++) {
				for(int h=k+1;h<N.length;h++) {
					if(N[j]+N[k]+N[h]<=M && N[j]+N[k]+N[h]>=memo) {
						
						memo=N[j]+N[k]+N[h];
					}
				}
			}
		}
		System.out.println(memo);
	}

}
