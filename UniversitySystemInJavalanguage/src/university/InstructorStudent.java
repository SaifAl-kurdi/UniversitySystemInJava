package university;

public class InstructorStudent {
	private int id;
	private String englishName;
	private String arabicName;

	public InstructorStudent() {

	}

	public InstructorStudent(int id, String englishName, String arabicName) {
		this.id = id;
		this.englishName = englishName;
		this.arabicName = arabicName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getArabicName() {
		return arabicName;
	}

	public void setArabicName(String arabicName) {
		this.arabicName = arabicName;
	}

	@Override
	public String toString() {
		return "InstructorStudent [id=" + id + ", englishName=" + englishName + ", arabicName=" + arabicName + "]";
	}
}
