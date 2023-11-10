package university;

import java.io.IOException;

import enhance.chain.AdministratorsHandler;
import enhance.chain.InstructorHandler;
import enhance.singleton.Singleton;
import enhance.singleton.SystemConfig;
import enhance.template.HtmlPrinter;
import enhance.template.Information;
import enhance.template.InformationPrinter;
import enhance.template.TextPrinter;

public class UserInterface {

	public static void main(String[] args) throws IOException {

		University university1 = new University(2011, "سيف الكردي", "Saif alkurdi", "Web1");
		University university2 = new University(2012, "محمود رمانة", "Mahmoud rummaneh", "Web2");
		University university3 = new University(2013, "برها زعيتر", "Borhan zaiter", "Web3");

		School school1 = new School(1, "كلية الحاسبات والمعلوماتية", "School of Computing and Informatics");
		School school2 = new School(2, "كلية تكنولوجيا الهندسة", "School of Engineering Technology");
		School school3 = new School(3, "كلية الهندسة المعمارية", "School of Architecture");

		Program program1 = new Program(14507, "علوم الحاسوب", "Computer Science", school1);
		Program program2 = new Program(14508, "امن سيبراني", "CyberSecurty", school1);
		Program program3 = new Program(14509, "علم البيانات", "Data Science", school1);

		Program program4 = new Program(7825043, "هندسة الطاقة", "Energy Engineering", school2);
		Program program5 = new Program(7825044, "الهندسة الكهربائية", "Electrical Engineering", school2);
		Program program6 = new Program(7825045, "هندسة عمارة ", "Architecture", school3);

		InstructorStudent /* i1 */ sInstructor1 = new InstructorStudent(115, "Muhammad", "محمد");
		InstructorStudent sInstructor2 = new InstructorStudent(116, "Salma", "سلمى");
		InstructorStudent sInstructor3 = new InstructorStudent(117, "Rami", "رامي");
		InstructorStudent sInstructor4 = new InstructorStudent(118, "Wasayef", "وصايف");
		InstructorStudent sInstructor5 = new InstructorStudent(119, "Hamzeh", "حمزة");

		InstructorStudent iStudent1 = new InstructorStudent(120, "Marwan", "مروان");
		InstructorStudent iStudent2 = new InstructorStudent(121, "Ma'an", "معن");
		InstructorStudent iStudent3 = new InstructorStudent(122, "Zaina", "زينة");
		InstructorStudent iStudent4 = new InstructorStudent(123, "Malak", "مالك");
		InstructorStudent iStudent5 = new InstructorStudent(124, "Ahmad", "احمد");

		Student student1 = new Student(iStudent1, "Male", 778866017, "1999-Month.APRIL-11", "s.kurdi@hotmail.com",
				university1, school1, program1, 3.6, 4.0, "Excellent", 2019, "Summer");
		Student student2 = new Student(iStudent2, "Male", 778811110, "1999-Month.APRIL-11", "s.kurdi@hotmail.com",
				university2, school2, program2, 3.5, 4.0, "Very good", 2020, "Summer");
		Student student3 = new Student(iStudent3, "Female", 778804818, "1999-Month.APRIL-11", "s.kurdi@hotmail.com",
				university3, school3, program3, 3.8, 4.0, "Excellent", 2018, "Summer");
		Student student4 = new Student(iStudent4, "Male", 778814785, "1999-Month.APRIL-11", "s.kurdi@hotmail.com",
				university2, school1, program4, 3.2, 4.0, "Good", 2017, "Summer");
		Student student5 = new Student(iStudent5, "Male", 77822222, "1999-Month.APRIL-11", "s.kurdi@hotmail.com",
				university3, school2, program5, 3.1, 4.0, "Good", 2019, "Summer");

		Factor factor1 = new FactorBulider(3.6, 8.7, student1).setEnglishMark(8.4).buildFactor();
		Factor factor2 = new FactorBulider(2.9, 6, student3).setMathMark(7.6).buildFactor();
		Factor factor3 = new FactorBulider(3.5, 8.4, student2).setPresentationSkills(8.5).buildFactor();
		Factor factor4 = new FactorBulider(3.1, 7, student5).buildFactor();

		Track track1 = new Track(123, "لغة C", "C language", 15,
				"C is a general-purpose computer programming language. It was created in the 1970s by Dennis Ritchie.",
				sInstructor1);
		Track track2 = new Track(124, "لغة جافا", "Java language", 15,
				"Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",
				sInstructor1);
		Track track3 = new Track(125, "لغة بايثون", "Python language", 15,
				"Python is a high-level, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation.",
				sInstructor1);
		Track track4 = new Track(126, "لغات ويب سايت", "HTML & CSS", 15,
				"Cascading Style Sheets is a style sheet language used for describing the presentation of a document written in a markup language such as HTML or XML.",
				sInstructor2);
		Track track5 = new Track(127, "جافا سكربت", "javascript", 15,
				"JavaScript, often abbreviated JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS.",
				sInstructor2);

		Track track6 = new Track(128, "مناهج البيئة المبنية", "Built Environment Curriculum", 15,
				"The course is given every second year. The course will focus on selected topics in relation to a sustainable built environment. The curriculum will be adapted to the individual students.",
				sInstructor3);
		Track track7 = new Track(129, "تصميم هندسي", "Engineering Design", 15,
				"Engineering design means a systematic way to produce, or steps used for producing, functional products and/or processes.",
				sInstructor3);
		Track track8 = new Track(130, "العمارة والوسائط الرقمية", "Architecture and digital media", 15,
				"An introduction to the graphic communication of architectural documents utilizing computer aided drafting (CAD) techniques.",
				sInstructor4);
		Track track10 = new Track(132, "استوديو التصميم المعماري 2", "Architectural Design Studio 2", 15,
				"This course is designed to give students who are majoring in architectural studies and who intend to pursue a professional degree in architecture at the graduate level exposure to a sophisticated conceptual framework for thinking about three-dimensional composition and architectural problem solving known as /system-based design/.",
				sInstructor5);
		Track track9 = new Track(131, "استوديو التصميم المعماري 1", "Architectural Design Studio 1", 15,
				"At the core of every nationally accredited school of architecture is the design studio.",
				sInstructor4);

		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		Instructor instructor3 = new Instructor();
		Instructor instructor4 = new Instructor();
		Instructor instructor5 = new Instructor();

		instructor1.addTrack(track1, track2, track3);
		instructor1.addTrack(track4, track5);
		instructor1.addTrack(track6, track7);
		instructor1.addTrack(track8, track9);
		instructor1.addTrack(track10);

		student1.addTrackPriority(track4, track1, track2, track3);
		student1.changedTrackPriority(track4, track10);
		student1.removeTrackPriority(track2);

		System.out.println(student1.getTrackStudent());

		student3.addTrackPriority(track7, track9, track10, track6);

		student2.addTrackPriority(track4, track6, track7, track9);

		student5.addTrackPriority(track1, track4, track2, track6);
		
		SystemConfig config = SystemConfig.getInstance();
		
		System.out.println(); 

		Information info1 = new Information(1);
		InformationPrinter informationPrinter = new TextPrinter();
		informationPrinter.printInformation(info1, "c:\\print\\order1.txt", iStudent1, student1, track1, factor1);

		informationPrinter = new HtmlPrinter();
		informationPrinter.printInformation(info1,"c:\\print\\order1.html", iStudent1, student1, track1, factor1);		
		
		InstructorHandler handler1 = new InstructorHandler();
		AdministratorsHandler handler2 = new AdministratorsHandler();

		handler1.setNextHandler(handler2);
		instructor1.getTracks(track1);
		handler1.handleLink(new Track("instructor"));
		handler2.handleLink(new Track("admin"));
		System.out.println("The mark of interview is aprroved");
	}

}
