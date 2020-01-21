package dev.tkdwls9277.algorithm;

import java.util.Scanner;

/**
 * 블랙잭(브루트포스) <=== 클래스 주석 위치 이동
 */
public class Algorithm2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  // FIXME <=== 의미 없는 자동완성 주석 삭제
		int count, M, memo=0;  // FIXME 변수명 M 의미있는 변수명으로 바꿔주세요
		int[] N;
		
		Scanner s = new Scanner(System.in);  // FIXME 변수명 s 무의미, stdin 시스템 리소스인데 close 안해서 warnning 뜹니다
		
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
