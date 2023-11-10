package enhance.template;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import university.Factor;
import university.InstructorStudent;
import university.Student;
import university.Track;

public abstract class InformationPrinter {

	protected abstract String header(InstructorStudent instructorStudent, Student student);

	protected abstract String content(Student student, Track track);

	protected abstract String footer(Information information, Factor factor);

	protected abstract String end();

	public final void printInformation(Information information, String fileName, InstructorStudent instructorStudent, Student student,
			Track track, Factor factor) throws IOException {

		Writer fw = new FileWriter(fileName);
		fw.write(header(instructorStudent, student));
		fw.write(content(student, track));
		fw.write(footer(information, factor));
		fw.write(end());
		fw.close();
	}
}
