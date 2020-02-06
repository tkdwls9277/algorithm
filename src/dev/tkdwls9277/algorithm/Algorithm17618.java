package dev.tkdwls9277.algorithm;

import java.util.Scanner;

/**
 * 신기한 수
 * <a href="https://www.acmicpc.net/problem/17618">https://www.acmicpc.net/problem/17618</a>
 * 
 * <pre>
 * 문제
 * 평소에 수에 대한 관심이 많은 아이인 민철이는 오늘도 노트에 연필로 수를 더하거나 빼거나 곱하거나 나눠보면서 시간을 보내고 있다. 
 * 그러다가 18이라는 수는 신기한 성질을 가진다는 것을 알아냈다. 18을 이루는 각 자릿수인 1과 8을 합한 9는 18의 약수가 된다.
 * 민철이는 18과 같이 모든 자릿수의 합으로 나누어지는 수를 여러 개 더 찾아냈는데, 12, 21도 그런 신기한 수였다. 
 * 민철이는 이렇게 모든 자릿수의 합으로 나누어지는 수를 “신기한 수”라고 부르기로 했다. 
 * 민철이는 더 큰 신기한 수를 찾아보기도 했는데 1729도 신기한 수라는 걸 알아내었다. 1729는 1+7+2+9=19로 나누어진다.
 * 민철이는 신기한 수가 얼마나 많은지 알고 싶었다. 
 * 주어진 자연수 N에 대해 N이하인 신기한 수는 총 몇 개인지 궁금했다. 
 * 하지만 N이하의 모든 수에 대해서 신기한 수인지 아닌지를 손으로 알아내기는 시간이 너무 오래 걸렸다.
 * 여러분은 민철이를 도울 수 있는 프로그램을 작성해야 한다. 
 * 입력으로 1 이상인 자연수 N이 주어질 때 N 이하인 신기한 수의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫 번째 줄에 정수 N (1 ≤ N ≤ 10,000,000) 하나가 주어진다.
 * 
 * 출력
 * N 이하인 신기한 수의 개수를 정수로 출력한다.
 * </pre>
 *깃 업로드 완료<br>
 */
public class Algorithm17618 {
    public static void main(String args[]) {
    	int a;
    	int mok = 0, ext;
    	int sum = 0;
    	int count = 0;
    	Scanner s = new Scanner(System.in);
    	a = s.nextInt();
    	
    	for(int i=1; i<=a; i++) {
    		mok = i;
    		sum = 0;
    		while(true) {
    			
    			if(mok == 0)
    				break;
    			ext = mok % 10;
    			mok = mok / 10;
    			
    			sum = sum + ext;
    		}
    		
    		if(i % sum == 0)
    			count++;
    	}
    	System.out.println(count);
    	s.close();
    }
}
