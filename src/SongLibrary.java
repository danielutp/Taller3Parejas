import java.util.ArrayList;

public class SongLibrary {
	ArrayList<Song> tracklist ;
	
	public SongLibrary() {
		this.tracklist = populateLibrary();
	}

	public SongLibrary(ArrayList<Song> tracklist) {
		this.tracklist = tracklist;
	}

	public ArrayList<Song> gettracklist() {
		return tracklist;
	}

	public void settracklist(ArrayList<Song> tracklist) {
		this.tracklist = tracklist;
	}
	
	public void addSong(Song song) {
		tracklist.add(song);
	}
	
	private ArrayList<Song> populateLibrary(){
		ArrayList<Song> songList = new ArrayList<Song>();
		 Song song = new Song("Rockstar1",1,"27-08-1995",1.18f,"Rock","Caratula", "clasico");
		 Song song1 = new Song("Rockstar2",1,"27-08-1995",1.18f,"Rock","Caratula", "clasico");
		 Song song2 = new Song("Rockstar3",1,"27-08-1995",1.18f,"Rock","Caratula", "clasico");
		 Song song3 = new Song("Rockstar4",1,"27-08-1995",1.18f,"Rock","Caratula", "clasico");
		 Song song4 = new Song("Rockstar5",1,"27-08-1995",1.18f,"Rock","Caratula", "clasico");
		 
		 songList.add(song1);
		 songList.add(song);
		 songList.add(song2);
		 songList.add(song3);
		 songList.add(song4);
		
		
		return songList;
	}
		

}