package fin.proxy;

import java.util.*;

public class ProxyUpdate implements Update {

	private Update update = new RealUpdate();
	private static List<String> thePhonesHasNotUpdated;

	static {
		thePhonesHasNotUpdated = new ArrayList<String>();		
		thePhonesHasNotUpdated.add("iphone 13 pro max");
		thePhonesHasNotUpdated.add("iphone 13 pro");
	}

	@Override
	public void UpdateTo(String phoneType) throws Exception {
		if (thePhonesHasNotUpdated.contains(phoneType.toLowerCase())) {
			throw new Exception("Sorry! This type phone has not been updated");

		}
		update.UpdateTo(phoneType);
	}
}
