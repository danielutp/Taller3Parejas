import java.util.ArrayList;

public class PlayList {
	ArrayList<String> tracklist;	
	
	
	public PlayList() {
		this.tracklist = new ArrayList<String>();
	}

	public ArrayList<String> gettracklist() {
		return tracklist;
	}

	public void settracklist(ArrayList<String> tracklist) {
		this.tracklist = tracklist;
	}
	
	public void addSongs(String song) {
		this.tracklist.add(song);
	}


}
