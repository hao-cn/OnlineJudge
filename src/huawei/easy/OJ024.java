package huawei.easy;

import java.util.Scanner;

//ͳ�ƴ�д��ĸ����
public class OJ024 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	String tmp = sc.nextLine();
		 	sc.close();
		 	char[] chars = tmp.toCharArray();
		 	int count = 0;
		 	for(int i = 0 ; i < chars.length ; i ++){
		 		if(Character.isUpperCase(chars[i]))
		 			count++;
		 	}
		 	System.out.println(count);
	 }
}

