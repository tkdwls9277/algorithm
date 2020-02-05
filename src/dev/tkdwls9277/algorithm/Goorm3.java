package dev.tkdwls9277.algorithm;
import java.io.*;

public class Goorm3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		
		int result[]=new int[repeat];

		for(int i=0;i<repeat;i++) {
			int size = Integer.parseInt(br.readLine());
			String[] bitnum = new String[3];
			
			for(int j=0;j<3;j++) {
				bitnum[j]=br.readLine();
			}
			String[] bitnum1 = bitnum[0].split("-");
			String[] bitnum2 = bitnum[1].split("-");
			String[] bitnum3 = bitnum[2].split("-");
			
			for(int j=0;j<size;j++) {
				int num1 = Integer.parseInt(bitnum1[j])^Integer.parseInt(bitnum2[j]);
				int num2 = Integer.parseInt(bitnum2[j])^Integer.parseInt(bitnum3[j]);
				num1 = num1|num2;

				String[] slice = Integer.toBinaryString(num1).split("");
				for(int k=0;k<slice.length;k++) {
					if(slice[k].equals("1")) {
						result[i]=result[i]+1;;
					}
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
