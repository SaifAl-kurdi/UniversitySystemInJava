package university;

public class School {
	private int id;
	private String arabicName;
	private String englishName;

	public School() {

	}

	public School(int id, String arabicName, String englishName) {
		super();
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
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

	@Override
	public String toString() {
		return "School [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName + "]";
	}

}
