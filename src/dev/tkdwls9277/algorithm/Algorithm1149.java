package dev.tkdwls9277.algorithm;

import java.util.Scanner;
/**
 * RGB거리 - 동적계산법
 * <a href="https://www.acmicpc.net/problem/1149">https://www.acmicpc.net/problem/1149</a>
 * 
 * <pre>
 * 문제
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
 * 집 i의 이웃은 집 i-1과 집 i+1이고, 첫 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 
 * 모든 집을 칠하는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 집의 수 N이 주어진다. 
 * N은 1,000보다 작거나 같다. 
 * 둘째 줄부터 N개의 줄에 각 집을 빨강으로, 초록으로, 파랑으로 칠하는 비용이 주어진다. 
 * 비용은 1,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
 * </pre>
 */
public class Algorithm1149 {
	
	public static int Min(int a, int b){ return a < b ? a : b; }
	
	public static void main(String[] args) {

		int[][] home = new int[1001][3];
		//testCase(home);
		showData(home);
	}
	
	static void testCase(int[][] home) {
		home[1][0]=26; home[1][1]=40; home[1][2]=83;
		home[2][0]=49; home[2][1]=60; home[2][2]=57;
		home[3][0]=13; home[3][1]=89; home[3][2]=99;
		rgb(home,3);
	}
	
	static void showData(int[][] home) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		for(int i=1;i<=count;i++) {
			home[i][0]=s.nextInt();
			home[i][1]=s.nextInt();
			home[i][2]=s.nextInt();
		}
		rgb(home,count);
		s.close();
	}
	
	static void rgb(int[][] home,int count) {
		for(int i=1;i<=count;i++) {
			home[i][0] = Min(home[i-1][1],home[i-1][2])+home[i][0];
			home[i][1] = Min(home[i-1][0],home[i-1][2])+home[i][1];
			home[i][2] = Min(home[i-1][0],home[i-1][1])+home[i][2];
		}
		System.out.println(Min(home[count][0],Min(home[count][1],home[count][2])));
	}

}
