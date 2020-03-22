/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

package day_28;

import java.util.Scanner;

public class StringEx16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.next();
		
		String[] temp = text.split(" ");
		
		int check = 0;
		for(int i=0;i<text.length();i++)
		{
			if(temp.equals(word))
			{
				check = 1;
			}
		}
		
		if(check == 1)
		{
			System.out.println("찾으시는 단어가 있습니다.");
		}
		else
		{
			System.out.println("찾으시는 단어가 없습니다.");
		}
	}
}
