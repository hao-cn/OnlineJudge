package huawei.easy;

import java.util.Scanner;

//�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
public class OJ013 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	char[] list = tmp.toCharArray();
		 	int[] count = new int[256];
		 	for(char c: list){
		 		count[c]++;
		 	}
		 	/** �����������Ԫ�ַ�����˳���ǰ�� **/
		 	for(char c: list){
		 		if(count[c] == 1){
		 			System.out.print(c);
		 			return;
		 		}
		 	}
		 	System.out.print('.');

	 }
}
