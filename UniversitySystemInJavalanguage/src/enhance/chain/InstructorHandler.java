package enhance.chain;
import university.Track;
public class InstructorHandler implements Handler {

	private Handler handler;

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleLink(Track track) {
		if (track.getAprove().toLowerCase().contains("instructor")) {
			System.out.println("Instructor: Yes, i approve, the number of the student in the track is enough to add new student");

		} else {
			System.out.println("Instructor syaing: I didn't approve the mark");
			handler.handleLink(track);
		}
	}

}
