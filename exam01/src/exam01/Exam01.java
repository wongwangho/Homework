package exam01;

public class Exam01 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
System.out.println("sum : " + sum);
	}

}
// 1~5까지 배열을 생성하고 배열의 합을 구하시오.
// 5개의 값을 알고있는 배열선언
// 1~5의 합을 sum변수에 저장
// 반복문을 사용하여 numbers의 값이 배열의 길이만큼 반복
// sum 변수에 
// 출력문으로 배열의 합 출력


