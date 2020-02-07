package dev.tkdwls9277.algorithm;

import java.util.Scanner;
import java.io.*;
/**
 * 동전 0 - 그리디 알고리즘
 * <a href="https://www.acmicpc.net/problem/11047">https://www.acmicpc.net/problem/11047</a>
 * 
 * <pre>
 * 문제
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 
 * 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. 
 * (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 * 
 * 출력
 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
 *</pre>
 *깃 업로드 완료<br>
 *
 */
public class Algorithm11047 {

	public static void main(String[] args) throws IOException {
		//test1();
		//test2();
		showData();
	}
	
	public static void test1() {
		int price = 4200;
		int[] value = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
		int result = Coin(price, value);
	}
	
	public static void test2() {
		int price = 4750;
		int[] value = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
		int result = Coin(price, value);
		
	}
	
	public static void showData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] sliceInput = input.split(" ");
		int count = Integer.parseInt(sliceInput[0]);
		int price = Integer.parseInt(sliceInput[1]);
		int[] value = new int[count];
		for(int i=0;i<count;i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		int result = Coin(price, value);
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	public static int Coin(int price, int[] value) {
		int result=0;
		for(int i=value.length-1;i>=0;i--) {
			if(price>=value[i]) {
				result = result + (price / value[i]);
				price = price % value[i];
			}
		}
		return result;
	}

}
