package cs520.module2.L3_inheritance.sample5;

public class Example5 {

	public static void main(String[] args) {
		Rectangle r1, r2, r3;
		r1 = new Rectangle(10, 20);
		r2 = new Rectangle(15, 10);
		r3 = new Rectangle(40, 5);

		System.out.println("r1 area = " + r1.area() + " r2 area = " + r2.area() + " r3 area = " + r3.area());

		Triangle t1, t2, t3;
		t1 = new Triangle(20, 10);
		t2 = new Triangle(80, 5);
		t3 = new Triangle(10, 15);

		System.out.println("t1 area = " + t1.area() + " t2 area = " + t2.area() + " t3 area = " + t3.area());
	}
}