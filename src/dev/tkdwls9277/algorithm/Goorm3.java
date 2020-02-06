package dev.tkdwls9277.algorithm;
import java.io.*;
/**
 * <pre>
 * 문제
 * 세 가지의 문자열을 파싱하여 다른 비트의 수를 구하는 문제
 * 
 * 입력
 * 2
 * 3
 * 255-128-3
 * 254-128-3
 * 254-128-19
 * 1
 * 0
 * 0
 * 1
 * 첫 줄에는 테스트케이스의 숫자를 나타내는 10이하의 자연수 T가 주어진다. 
 * 이후 총 T개의 칩에 대한 테스트케이스의 입력이 주어진다.
 * 테스트케이스의 첫 줄에는 해당 칩이 출력하는 바이트의 수를 나타내는 50만이하의 자연수 L이 주어진다.
 * 이후 세 줄에 걸쳐서 각 줄에 저온/고온/상온에서의 칩의 출력 결과가 주어진다.
 * 
 * 출력
 * 2
 * 1
 * 3
 * 각 테스트케이스에 대하여 해당 칩이 온도별로 상이한 결과를 나타내는 비트의 수를 한 줄에 정수로 출력한다.
 * </pre>
 *깃 업로드 완료<br>
 */
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
