package huawei.easy;

import java.util.Scanner;

//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
public class OJ009 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	int[] count = new int[4];
		 	char[] list = tmp.toCharArray();
		 	for(char c: list){
		 		if(Character.isLetter(c))
		 			count[0]++;
		 		else if(c == ' ')
		 			count[1]++;
		 		else if(Character.isDigit(c))
		 			count[2]++;
		 		else
		 			count[3]++;
		 	}
		 	System.out.println(count[0]);
		 	System.out.println(count[1]);
		 	System.out.println(count[2]);
		 	System.out.println(count[3]);
	 }
}
