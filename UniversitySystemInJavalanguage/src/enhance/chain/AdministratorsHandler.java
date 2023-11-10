package enhance.chain;
import university.Track;
public class AdministratorsHandler implements Handler {

	private Handler handler;

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleLink(Track track) {
		if (track.getAprove().toLowerCase().contains("admin")) {
			System.out.println("Administrator: Yes, I approve");

		} else {
			System.out.println("Administrator saying: The instructor didn't approve the mark");
			handler.handleLink(track);
		}
	}

}
