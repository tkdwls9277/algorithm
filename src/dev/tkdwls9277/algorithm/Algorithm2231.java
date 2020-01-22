package dev.tkdwls9277.algorithm;

import java.util.Scanner;

/**
 * 분해합
 * https://www.acmicpc.net/problem/2231
 * 
 * <pre>
 * 문제
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 
 * 따라서 245는 256의 생성자가 된다. 
 * 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 
 * 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 
 * 출력
 * 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 * </pre>
 */
public class Algorithm2231 {

	public static void main(String[] args) {
		//test1();
		getdata();
	}
	
	/**
	 * 메소드 이름이 getData() 인데 리턴이 void 라서 데이터를 가져오지 않아서 메소드명이 어색하네여
	 * println(result) 를 하는게 메소드 목적인거 같은데
	 * printData() 라든가 showData() 등이 좋을거 같아요
	 */
	public static void getdata() {
		int number, result;
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		result = SliceSum(number);
		
		System.out.println(result);
		
		s.close();
	}
	
	public static void test1() {
		int result;
		result=SliceSum(216);
		System.out.println(result);
	}
	
	/**
	 * FIXME namurge = temp % 10; for(int i=num; i>=0; i--) 처럼 연산자와 피연산자 사이에는 띄워주세요, 가독성 떨어지네여
	 */
	public static int SliceSum(int num) {
		int temp,namurge;
		int resultsum;
		int result=0;
		for(int i=num;i>=0;i--) {
			temp=i;
			resultsum=i;
			namurge=1;
			while(temp!=0) {
				namurge=temp%10;
				temp=temp/10;
				resultsum=resultsum+namurge;
			}
			if(resultsum==num) {
				result=i;
			}
		}
		return result;
	}

}
