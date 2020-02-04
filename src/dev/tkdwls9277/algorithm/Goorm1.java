package dev.tkdwls9277.algorithm;
import java.io.*;
import java.util.Arrays;
/**
 * 참조문헌 작성하기
 * 
 * 참조문헌을 숫자로 변환 오름차순변환
 */
public class Goorm1 {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			//String input = "deeper previously.[ some_paper_a, some_paper_b ] We [ some_book_a, some_paper_a ] increased depth. [ some_book_b ]";
			String[] array_word = input.split("");
			
			getToken(array_word);
			
			
		}
		
		public static void getToken(String[] array_word) {
			
			boolean swc=false;
			String[] new_array_word = new String[10];
			int new_array_word_count=0;
			String newtoken = "";
			
			String[] result_input=new String[array_word.length];
			int result_input_count=0;
			
			int[] buffer=new int[10];
			int buffercount=0;
			
			for(int i=0;i<array_word.length;i++) {
				//괄호가 시작하는경우 스위치를 바꿔준다
				if(array_word[i].equals("[")) {
					result_input[result_input_count++]="[";
					swc=true;
				}
				//괄호가 닫힌경우
				else if(array_word[i].equals("]")) {
					int iscount=0;
					int breakpoint=0;
					//참조문헌목록에 있는지 체크
					for(int j=0;j<new_array_word_count;j++) {
						if(new_array_word[j].equals(newtoken)) {
							iscount=1;
							breakpoint=j;
							newtoken="";
							break;
						}
					}
					//이미 참조한 문헌이면 그 번호를 아니면 이후에 추가해서 넣음
					switch(iscount) {
					case 0 : 
						new_array_word[new_array_word_count]=newtoken;
						buffer[buffercount++]=new_array_word_count;
						new_array_word_count++;
						newtoken="";
					break;
					case 1 : 
						buffer[buffercount++]=breakpoint;
						break;
					default : 
						break;
					}
					//정렬 후 결과 문자열에 저장
					Arrays.sort(buffer,0,buffercount);
					for(int j=0;j<buffercount;j++) {
						result_input[result_input_count++]=" "+(buffer[j]+1);
						
						if(j+1==buffercount)break;
						result_input[result_input_count++]=",";
					}
					buffercount=0;
					result_input[result_input_count++]=" ]";
					swc=false;
				}
				//괄호 안에 있는 경우
				else if(swc==true) {
					if(array_word[i].equals(",")) {
						new_array_word[new_array_word_count]=newtoken;
						buffer[buffercount++]=new_array_word_count;
						new_array_word_count++;
						newtoken="";
					}
					if(array_word[i].equals(",")||array_word[i].equals(" "))continue;
					newtoken=newtoken+array_word[i];
				}
				//괄호 밖의 경우 그냥 결과 문자열에 추가
				else if(swc==false) {
					result_input[result_input_count++]=array_word[i];
				}
			}
			//출력
			for(int i=0;i<result_input_count;i++) {
				System.out.print(result_input[i]);
			}
			System.out.print("\n");
			for(int i=0;i<new_array_word_count;i++) {
				System.out.println("["+(i+1)+"] "+new_array_word[i]);
			}
		}
	}