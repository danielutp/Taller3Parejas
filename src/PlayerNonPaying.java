
public class PlayerNonPaying extends Player {

	@Override
	void player(Song song) {
		System.out.println("reproduciendo : " + song.title);
		System.out.println("reproduciendo Comerical!!!!");
		
	}
	public void player(PlayList songList) {
		for (String songName : songList.tracklist) {

			for (Song song : this.songLibrary.tracklist) {

				if (songName.equals(song.title)) {
					player(song);
				}
			}
		}
	}

}
