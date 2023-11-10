package university;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

	private List<Track> tracks = new ArrayList<Track>();

	public Instructor() {

	}

	public List<Track> getTracks(Track track) {
		return tracks;
	}

	public void addTrack(Track... track) {
		for (int i = 0; i < track.length; i++) {
			tracks.add(track[i]);
		}
	}

	@Override
	public String toString() {
		return "Instructor [track=" + tracks + "]";
	}

}
