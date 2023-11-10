package university;

public class Track {

	private int id;
	private String arabicName;
	private String englishName;
	private int maximumNumberOfStudents;
	private String description;
	private InstructorStudent instructor;
	private String aprove;

	
	public Track(String string) {

	}

	public Track(int id, String arabicName, String englishName, int maximumNumberOfStudents, String description,
			InstructorStudent instructor) {
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.maximumNumberOfStudents = maximumNumberOfStudents;
		this.description = description;
		this.instructor = instructor;

		
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

	public int getMaximumNumberOfStudents() {
		return maximumNumberOfStudents;
	}

	public void setMaximumNumberOfStudents(int maximumNumberOfStudents) {
		this.maximumNumberOfStudents = maximumNumberOfStudents;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public InstructorStudent getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorStudent instructor) {
		this.instructor = instructor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getAprove() {
		return aprove;
	}

	public void setAprove(String aprove) {
		this.aprove = aprove;
	}

	@Override
	public String toString() {
		return "Track [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName
				+ ", maximumNumberOfStudents=" + maximumNumberOfStudents + ", description=" + description
				+ ", instructor=" + instructor + "]";
	}

	

}
