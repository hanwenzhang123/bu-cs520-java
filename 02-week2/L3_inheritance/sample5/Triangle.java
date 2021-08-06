package cs520.module2.L3_inheritance.sample5;

class Triangle extends Form implements Shape, Drawable {

	private int base, height;

	public void form() {
		
	}

	public void draw() {

	}

	public Triangle(int b, int h) {
		base = b;
		height = h;
	}

	public double area() {
		return 0.5 * base * height;
	}

	public int compareTo(Shape s) {
		double thisArea = area();
		double otherArea = s.area();

		if (thisArea < otherArea) {
			return -1;
		} else if (thisArea == otherArea) {
			return 0;
		} else {
			return 1;
		}
	}
}
