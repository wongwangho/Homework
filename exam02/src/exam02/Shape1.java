package exam02;

public abstract class Shape1 extends Shape {
	
	public static void main(String[] args) {
		Shape1 sp = new Shape1() {};
		sp.calculateArea();
	}

	@Override
	public double calculateArea() {
		System.out.println("구현 클래스");
		return 0;
	}
	
	

}
