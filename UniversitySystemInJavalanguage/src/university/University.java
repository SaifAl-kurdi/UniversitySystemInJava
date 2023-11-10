package university;

public class University {
	private int id;
	private String arabicName;
	private String englishName;
	private String website;

	public University() {
	}

	public University(int id, String arabicName, String englishName, String website) {
		super();
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.website = website;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArabicName() {
		return arabicName;
	}

	public void setArabicName(String arabicName) {
		this.arabicName = arabicName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName + ", website="
				+ website + "]";
	}

}
