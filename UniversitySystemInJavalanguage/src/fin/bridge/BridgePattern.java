package fin.bridge;

public class BridgePattern {

	public static void main(String[] args) {

		Shape shape1 = new Circle(new Red());
		shape1.draw();

		Shape shape2 = new Parallelogram(new Orange());
		shape2.draw();

	}
}
