package exam01;

public class Exam03 {

	public static void main(String[] args) {

		//while문을 사용하여 조건식이 true일때 무한반복하도록 실행
		//sum 변수에 i가 증가하는 값을 저장
		int sum = 0;
		int i =1;
		
			while(i <= 5 ) {
				sum += i;
				i++;
			}
			
			System.out.println(sum);
		}
		
	}

