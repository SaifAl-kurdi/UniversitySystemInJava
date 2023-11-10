package enhance.template;

import java.util.Date;
import university.Factor;
import university.InstructorStudent;
import university.Student;
import university.Track;



public class TextPrinter extends InformationPrinter {

	Date currentDate = new Date();
	protected String header(InstructorStudent instructorStudent,Student student) {
		return "Advanced Programming Project: Student Information:\n\n\n\n" + instructorStudent.getEnglishName() + ", "+student.getUniversity() +", "+ student.getSchool()+", "+student.getProgramme()+", "+ currentDate+ " \n";
	}


	@Override
	protected String content(Student student, Track track) {
		return "Track number: " + track.getId()+"\nThe track name: "+track.getEnglishName()+", "+student.getTrackStudent().lastIndexOf(track);
	}

	
	@Override
	protected String footer(Information information, Factor factor) {
	StringBuilder builder = new StringBuilder("The sum of marks is: "+factor.sumOfMarks());
				
		
		return builder.toString();
	}

	@Override
	protected String end() {
		return " ";
	}
}
