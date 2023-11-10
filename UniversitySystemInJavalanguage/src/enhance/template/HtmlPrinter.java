package enhance.template;

import java.util.Date;
import java.util.List;

import university.Factor;
import university.InstructorStudent;
import university.Student;
import university.Track;


public class HtmlPrinter extends InformationPrinter {

	Date currentDate = new Date();
	
	@Override
	protected String header(InstructorStudent instructorStudent,Student student) {
		return "<html><head><title>Advanced programing </title></head><body><h1> Advanced programing Project: Student Information:<br><h2>Student name:"+ instructorStudent.getEnglishName() + ", University: "+student.getUniversity() +", School: "+student.getSchool()+", Program: "+ student.getProgramme()+ ", Current Date: "+ currentDate+ "</h2></h1>";
	}

	@Override
	protected String content(Student student, Track track) {
		return "<h2><br>Track number: <br><h3>" +track.getId()+"<br>The track name: "+track.getEnglishName()+"<br> Priority: "+student.getTrackStudent().lastIndexOf(track)+"</h3><br></h2>";
	}

	@Override
	protected String footer(Information information, Factor factor) {
		StringBuilder builder = new StringBuilder("<br><br><br><br><br><br><br><footer><h1> The sum of marks is: "+factor.sumOfMarks());
		
		builder.append("</h1></footer>");
		return builder.toString();
	}

	@Override
	protected String end() {
		return "</body></html>";
	}

}
