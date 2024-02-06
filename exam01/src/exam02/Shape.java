package exam02;

interface Shape {
	 void draw();
	}
	abstract class Circle implements Shape {
	 public void draw() {
	 System.out.println("Drawing a circle");
	 }
	}
	class Main {
	 public static void main(String[] args) {
	  Circle circle = new Circle() {};
	 circle.draw();
	 }
	}

	
// Shape인터페이스를  만든다
// 추상클래스로 Shape 인터페이스를 구현한다
// 추상메서드를 사용할시는 반드시 접근제한자 public를 사용한다
// main 클래스에서 객체를 생성해 메서드를 불러온다
// 자식클래스를 이용해 객체를 만든다
