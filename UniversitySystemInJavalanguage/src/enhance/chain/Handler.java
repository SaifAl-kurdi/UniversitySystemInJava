package enhance.chain;
import university.Track;
public interface Handler {
	
	void setNextHandler(Handler handler);
	void handleLink(Track track);

}
