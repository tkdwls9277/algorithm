package dev.tkdwls9277.algorithm;

import java.io.*;
/**
 *<pre>
 * 문제
 * 문자열 정규화 하기
 * 알파벳 대소문자로 이루어진 이름과 성이 주어질 때 이를 아래의 형식을 따르는 문자열로 변환하는 함수를 작성하시오.
 * {이름} {성} 순서를 따르며 이름과 성 사이는 공백으로 구분한다.
 * 이름과 성은 가장 첫 글자가 대문자이고 이후는 모두 소문자로 변환되어야 한다.
 * 
 * 입력
 * 첫 줄에는 테스트케이스의 수를 나타내는 100이하의 자연수 T가 주어진다.
 * 3
 * mijoo lee
 * JIAE Yoo
 * jiSOO seo
 * 
 * 출력
 * 첫 줄에는 테스트케이스의 변호를 Case #%d형식으로 출력한다.
 * 두번째 줄에는 문제에 주어진 조건에 따라 형식화 된 이름 문자열을 한 줄에 출력한다.
 * Case #1
 * Mijoo Lee
 * Case #2
 * Jiae Yoo
 * Case #3
 * Jisoo Seo
 * 
 *</pre>
 *
 *깃 업로드 완료<br>
 */
public class Goorm4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] input = new String[count];
		for(int i=0;i<count;i++) {
			input[i]=br.readLine();
		}
		//int count=2;
		//String[] input= {"leE sanGJIN","jang IlEa"};
		String[] result = new String[count];
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<input[i].length();j++) {
				char c = input[i].charAt(j);
				if(j==0) {
					if((97<=c)&&(c<=122)) {
						result[i]=input[i].valueOf(c).toUpperCase();
					}else {
						result[i]=String.valueOf(c);
					}
				}else if(c==' ') {
					j++;
					c = input[i].charAt(j);
					if((97<=c)&&(c<=122)) {
						result[i]=result[i]+" "+input[i].valueOf(c).toUpperCase();
					}else {
						result[i]=result[i]+" "+c;	
					}
				}else if((65<=c)&&(c<=90)) {
					result[i]+=input[i].valueOf(c).toLowerCase();
				}else {
					result[i]+=c;	
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println("Case #"+(i+1));
			System.out.println(result[i]);
		}
	}
}
