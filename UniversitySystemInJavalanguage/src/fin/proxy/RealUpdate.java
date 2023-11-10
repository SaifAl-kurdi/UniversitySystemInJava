package fin.proxy;

public class RealUpdate implements Update {

	@Override
	public void UpdateTo(String phoneType) throws Exception {
		System.out.println("Update " + phoneType);
	}
}
