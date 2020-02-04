package dev.tkdwls9277.algorithm;

import java.util.Scanner;


/**
 * 정수삼각형 - 동적계산법
 * <a href = "https://www.acmicpc.net/problem/1932">https://www.acmicpc.net/problem/1932</a>
 * 
 * <pre>
 * 문제
 *          7
 *        3   8
 *      8   1   0
 *    2   7   4   4
 *  4   5   2   6   5
 *  
 *  위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
 *  맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 
 *  이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 
 *  아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 *  삼각형의 크기는 1 이상 500 이하이다. 
 *  삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
 *  
 *  입력
 *  첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
 *  
 *  출력
 *  첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
 * </pre>
 *
 */
public class Algorithm1932 {

	public static int Max(int a, int b){ return a > b ? a : b; }
	
	public static void main(String[] args) {
		int[][] ract = new int[500][500];
		//testCase(ract);
		showData(ract);
	}
	
	static void testCase(int[][] ract) {
		ract[0][0]=7;
		ract[1][0]=3; ract[1][1]=8;
		ract[2][0]=8; ract[2][1]=1; ract[2][2]=0;
		ract[3][0]=2; ract[3][1]=7; ract[3][2]=4; ract[3][3]=4;
		ract[4][0]=4; ract[4][1]=5; ract[4][2]=2; ract[4][3]=6; ract[4][4]=5;
		
		Ract(ract,5);
	}
	
	static void showData(int[][] ract) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		for(int i=0;i<count;i++) {
			for(int j=0;j<=i;j++) {
				ract[i][j]=s.nextInt();
			}
		}
		Ract(ract,count);
		s.close();
	}
	
	static void Ract(int[][] ract, int count) {
		for(int i=1;i<count;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) {
					ract[i][j]=ract[i-1][j]+ract[i][j];
				}else if(j==i) {
					ract[i][j]=ract[i-1][j-1]+ract[i][j];
				}else {
					ract[i][j]=Max(ract[i-1][j-1],ract[i-1][j])+ract[i][j];
				}
			}
		}
		
		int temp=0;
		for(int i=0;i<count;i++) {
			if(temp < ract[count-1][i]) {
				temp=ract[count-1][i];
			}
		}
		System.out.println(temp);
	}

}
