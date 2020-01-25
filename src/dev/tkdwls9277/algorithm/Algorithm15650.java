package dev.tkdwls9277.algorithm;

import java.util.*;

/**
 * N과 M(백트레킹) - 오름차순
 * https://www.acmicpc.net/problem/15650
 * 
 * <pre>
 * 문제
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * * 고른 수열은 오름차순이어야 한다.
 * 
 * 입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 
 * 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * </pre>
 * 
 */
public class Algorithm15650 {
	static int[] arr;
	static boolean[] visit;
	
	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		showData();
	}
	
	static void showData() {
		Scanner s = new Scanner(System.in);
		
		int first, second;
		first = s.nextInt();
		second = s.nextInt();
		
		arr=new int[second];
		visit=new boolean[first+1];
		
		solution(first,second,0);
		s.close();
	}
	
	static void test1() {
		arr=new int[1];
		visit=new boolean[4];
		solution(3,1,0);
	}

	static void test2() {
		arr=new int[2];
		visit=new boolean[5];
		solution(4,2,0);
	}

	static void test3() {
		arr=new int[4];
		visit=new boolean[5];
		solution(4,4,0);
	}
	
	static void solution(int numN, int numM, int count) {
		
		if(numM==count) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
			return;
		}
		
		
		for(int i=1;i<=numN;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[count]=i;
				
				if(count != 0) {
					if(arr[count-1] > arr[count]) {
						visit[i]=false;
						continue;
					}
				}
				
				solution(numN,numM,count+1);
				visit[i]=false;
			}
		}
		return;
		
	}

}
