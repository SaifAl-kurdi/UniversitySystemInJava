package fin.proxy;

public class TestProxy {

	public static void main(String[] args) {

		Update update = new ProxyUpdate();

		try {
			update.UpdateTo("iphone 13");
			update.UpdateTo("iphone 13 pro max");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
