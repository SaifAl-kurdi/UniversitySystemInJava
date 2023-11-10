package university;

public class Factor {

	private double GPA;
	private double interview;
	private double englishMark;
	private double mathMark;
	private double presentationSkills;
	double sumOfMarks;
	private Student student;

	public Factor() {

	}

	public Factor(double GPA, double interview, Student student, double englishMark, double mathMark,
			double presentationSkills) {
		super();
		this.GPA = GPA;
		this.interview = interview;
		this.englishMark = englishMark;
		this.mathMark = mathMark;
		this.presentationSkills = presentationSkills;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public double getInterview() {
		return interview;
	}

	public void setInterview(double interview) {
		this.interview = interview;
	}

	public double getEnglishMark() {
		return englishMark;
	}

	public void setEnglishMark(double englishMark) {
		this.englishMark = englishMark;
	}

	public double getMathMark() {
		return mathMark;
	}

	public void setMathMark(double mathMark) {
		this.mathMark = mathMark;
	}

	public double getPresentationSkills() {
		return presentationSkills;
	}

	public void setPresentationSkills(double presentationSkills) {
		this.presentationSkills = presentationSkills;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double sumOfMarks() {
		sumOfMarks = GPA + englishMark + interview + mathMark + presentationSkills;
		return sumOfMarks;

	}

	@Override
	public String toString() {
		return "Factor [GPA=" + GPA + ", interview=" + interview + ", englishMark=" + englishMark + ", mathMark="
				+ mathMark + ", presentationSkills=" + presentationSkills + ", student=" + student + "]";
	}

}
