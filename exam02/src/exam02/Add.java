package exam02;

import java.util.Scanner;

public class Add {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int result = 0;
		
		System.out.println("숫자를 입력하세요 :");
		num  = sc.nextInt();
		for(int i = 0; i <= num; i++) {
			
			result += i;
		
		
		}
		System.out.println(result);

	}

}
// 1부터 입력받은 숫자까지의 합을 구하기 