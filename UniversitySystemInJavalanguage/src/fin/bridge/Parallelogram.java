package fin.bridge;

public class Parallelogram extends Shape {

	public Parallelogram(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Triangle drawn. ");
		color.fillColor();
	}
}
