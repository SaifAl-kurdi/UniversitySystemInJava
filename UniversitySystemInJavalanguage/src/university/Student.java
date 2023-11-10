package university;

import java.util.ArrayList;

import java.util.List;


public class Student {
	private InstructorStudent instructorStudent;
	private String sex;
	private int mobile;
	private String birthdate;
	private String email;
	private University university;
	private School school;
	private Program programme;
	private double finalAverage;
	private double maximumAverage;
	private String rate;
	private int graduateYear;
	private String graduateSemester;
	private List<Track> trackStudent = new ArrayList<Track>();

	public Student() {
	}

	public Student(InstructorStudent instructorStudent, String sex, int mobile, String birthdate, String email, university.University university, School school,
			Program programme, double finalAverage, double maximumAverage, String rate, int graduateYear,
			String graduateSemester) {
		this.sex = sex;
		this.mobile = mobile;
		this.birthdate = birthdate;
		this.email = email;
		this.university = (University) university;
		this.school = school;
		this.programme = programme;
		this.finalAverage = finalAverage;
		this.maximumAverage = maximumAverage;
		this.rate = rate;
		this.graduateYear = graduateYear;
		this.graduateSemester = graduateSemester;
		this.instructorStudent = instructorStudent;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Program getProgramme() {
		return programme;
	}

	public void setProgramme(Program programme) {
		this.programme = programme;
	}

	public double getFinalAverage() {
		return finalAverage;
	}

	public void setFinalAverage(double finalAverage) {
		this.finalAverage = finalAverage;
	}

	public double getMaximumAverage() {
		return maximumAverage;
	}

	public void setMaximumAverage(double maximumAverage) {
		this.maximumAverage = maximumAverage;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public int getGraduateYear() {
		return graduateYear;
	}

	public void setGraduateYear(int graduateYear) {
		this.graduateYear = graduateYear;
	}

	public String getGraduateSemester() {
		return graduateSemester;
	}

	public void setGraduateSemester(String graduateSemester) {
		this.graduateSemester = graduateSemester;
	}

	public List<Track> getTrackStudent() {
		return trackStudent;
	}

	public void setTrackStudent(List<Track> trackStudent) {
		this.trackStudent = trackStudent;
	}


	public InstructorStudent getInstructorStudent() {
		return instructorStudent;
	}

	public void setInstructorStudent(InstructorStudent instructorStudent) {
		this.instructorStudent = instructorStudent;
	}

	public void addTrackPriority(Track... track) {
		for (int i = 0; i < track.length; i++) {
			trackStudent.add(track[i]);
		}
	}

	public void removeTrackPriority(Track... track) {
		for (int i = 0; i < track.length; i++) {
			trackStudent.remove(track[i]);
		}
	}

	public void changedTrackPriority(Track oldTrack, Track newTrack) {
		trackStudent.set(trackStudent.indexOf(oldTrack), newTrack);
	}
	@Override
	public String toString() {
		return "Student [instructorStudent=" + instructorStudent + ", sex=" + sex + ", mobile=" + mobile
				+ ", birthdate=" + birthdate + ", email=" + email + ", university=" + university + ", school=" + school
				+ ", programme=" + programme + ", finalAverage=" + finalAverage + ", maximumAverage=" + maximumAverage
				+ ", rate=" + rate + ", graduateYear=" + graduateYear + ", graduateSemester=" + graduateSemester
				+ ", trackStudent=" + trackStudent + "]";
	}


	
}