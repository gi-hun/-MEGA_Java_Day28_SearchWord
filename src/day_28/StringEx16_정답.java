/*

 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */

package day_28;

import java.util.Scanner;

public class StringEx16_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.next();
		
		char[] arr = new char[text.length()];
		
		for(int i=0;i<text.length();i++)
		{
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1;
		for(int i=0;i<arr.length - size+1;i++)		//�ι�° for������ size��ŭ �����ֱ� ������ 
		{											//ù��° for������ ���ش�.
			int count = 0;
			for(int j=0;j<size;j++)
			{
				if(arr[i+j] == word.charAt(j))
				{
					count++;
				}
			}
			
			if(count==size)
			{
				check = 1;
			}
		}
		
		if(check == 1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
