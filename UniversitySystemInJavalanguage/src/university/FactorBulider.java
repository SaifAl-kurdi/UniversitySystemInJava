package university;

public class FactorBulider {

	private double GPA;
	private double interview;
	private double englishMark;
	private double mathMark;
	private double presentationSkills;
	private Student student;

	public FactorBulider(double GPA, double interview, Student student) {
		super();
		this.GPA = GPA;
		this.interview = interview;
		this.student = student;
	}

	public FactorBulider setEnglishMark(double englishMark) {
		this.englishMark= englishMark;
		return this;
	}

	public FactorBulider setMathMark(double mathMark) {
		this.mathMark= mathMark;
		return this;
	}

	public FactorBulider setPresentationSkills(double presentationSkills) {
		this.presentationSkills = presentationSkills;
		return this;
	}

	public FactorBulider setGPA(double GPA) {
		this.GPA = GPA;
		return this;
	}

	public FactorBulider setInterview(double interview) {
		this.interview = interview;
		return this;
	}
	
	public FactorBulider setStudent(Student student) {
		this.student = student;
		return this;
	}

	public Factor buildFactor() {
		return new Factor(GPA, interview, student, englishMark, mathMark, presentationSkills);
	}
}
