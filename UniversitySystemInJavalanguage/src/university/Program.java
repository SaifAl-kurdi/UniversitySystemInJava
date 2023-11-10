package university;

import java.util.*;

public class Program {

	private int id;
	private String arabicName;
	private String englishName;
	private School school;


	public Program() {

	}

	public Program(int id, String arabicName, String englishName, School school) {
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.school = school;

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

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Program [id=" + id + ", arabicName=" + arabicName + ", englishName=" + englishName + ", school="
				+ school + "]";
	}

}
