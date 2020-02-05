package dev.tkdwls9277.algorithm;

import java.io.*;

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
