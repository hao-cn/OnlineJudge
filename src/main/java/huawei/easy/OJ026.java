package huawei.easy;

import java.util.Scanner;

//��int���������ڴ��д洢ʱ1�ĸ���
public class OJ026 {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	Integer tmp = sc.nextInt();
		 	sc.close();
		 	String bS = Integer.toBinaryString(tmp);
		 	int count = 0;
		 	for(int i = 0; i < bS.length() ; i ++){
		 		if(bS.charAt(i) == '1')
		 			count++;
		 	}
		 	System.out.println(count);
	 }
}

