/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */

package day_28;

import java.util.Scanner;

public class StringEx16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
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
			System.out.println("ã���ô� �ܾ �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("ã���ô� �ܾ �����ϴ�.");
		}
	}
}
