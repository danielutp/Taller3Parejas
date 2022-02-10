import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PlayerPaid extends Player {

	public PlayerPaid() {
		super();
	}

	@Override
	void player(Song song) {
		System.out.println("reproduciendo : " + song.title);

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
