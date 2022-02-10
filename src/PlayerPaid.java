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

	public PlayList createPlayList() {
		PlayList playList = new PlayList();
		System.out.println("Bienvenido al sistema para la creacion PlayList\n");
		System.out.println("..::Por Favor agregue cancion::..\n");

		String title = JOptionPane.showInputDialog("..::Por Favor agregue cancion por el nombre::..");
		boolean done = false;
		
		while(done == false) {			
			addToPlayList(playList, title);
			String validar = JOptionPane.showInputDialog("..::Desea agregar mas canciones?::..");
			if(validar.equalsIgnoreCase("y")) {
				title = JOptionPane.showInputDialog("..::Por Favor agregue cancion por el nombre::..");				
			}else {
				done = true;
			}			
		}		
		return playList;

	}

	private PlayList addToPlayList(PlayList playList, String title) {

		for (Song song : this.songLibrary.tracklist) {

			if (title.equals(song.title)) {
				playList.addSongs(title);
				break;
			}
		}
		
		return playList;
	}

}
