package enhance.singleton;

import java.util.HashMap;
import java.util.Map;

public class SystemConfig  {

	public static SystemConfig instance;
	private Map<String, String> systemConfiguration;

	private SystemConfig() {
		systemConfiguration = new HashMap<String, String>();
		systemConfiguration.put("Idle time", "10 minutes");
		systemConfiguration.put("theme name", "bootstrap");
		systemConfiguration.put("Font name", "Times New Roman");
		systemConfiguration.put("Supported user interface languages", "Arabic and English");
	}

	public String get(String key) {
		return systemConfiguration.get(key);
	}

	public String update(String key, String value) {
		return systemConfiguration.put(key, value);
	}

	public static SystemConfig getInstance() {
		if (instance == null) {
			instance = new SystemConfig();
		}
		return instance;
	}

}
