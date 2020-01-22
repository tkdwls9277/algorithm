package dev.tkdwls9277.algorithm;

import java.util.Scanner;

//분해합
public class Algorithm2231 {

	public static void main(String[] args) {
		//test1();
		getdata();
	}
	
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
