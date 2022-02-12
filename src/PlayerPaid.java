import java.text.ParseException;
import javax.swing.JOptionPane;
/**
 * Clase que representa una cancion, sus atributos y algunos metodos para acceder y modificar los mismos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 *
 */
public class PlayerPaid extends Player {
	/**
	 * Metodo constructor
	 * @throws ParseException
	 */
	public PlayerPaid() throws ParseException {
		super();
	}
	
	/**
	 *Metodo que extiende de Player para reproducir una cancion.
	 */
	@Override
	void player(Song song) {
		JOptionPane.showMessageDialog(null,"reproduciendo : " + song.title);
	}

	/**
	 * Metodo que reproduce una lista de canciones
	 * @param songList
	 */
	public void player(PlayList songList) {
		for (String songName : songList.tracklist) {
			for (Song song : this.songLibrary.tracklist) {
				if (songName.equalsIgnoreCase(song.title)) {
					player(song);
				}
			}
		}
	}
	
	/**
	 * Metodo para crear una playlist como la desea el usuario
	 * @return playList
	 * @throws ParseException
	 */
	public PlayList createPlayList() throws ParseException {
		JOptionPane.showMessageDialog(null,"Se imprimira las canciones de la lista creada por defecto para que recuerde el nombre de las canciones");
		PlayList playList = new PlayList();
		PlayerNonPaying playernonpaying = new PlayerNonPaying();
		playernonpaying.reproduceLibrary();
		String title = JOptionPane.showInputDialog("Por Favor agregue el nombre de la cancion a la nueva playlist");
		boolean done = false;
		
		while(done == false) {			
			addToPlayList(playList, title);
			String validar = JOptionPane.showInputDialog("Desea agregar mas canciones?\n"+"Ingrese Si para continuar\n"+"De lo contrario ingrese No");
			if(validar.equalsIgnoreCase("Si")) {
				title = JOptionPane.showInputDialog("Por Favor agregue el nombre de la cancion a la nueva playlist");				
			}else {
				done = true;
			}			
		}		
		return playList;
	}
	
	/**
	 * Metodo para añadir a una playlist el nombre de la cancion
	 * @param playList
	 * @param title
	 * @return playList
	 */
	private PlayList addToPlayList(PlayList playList, String title) {
		for (Song song : this.songLibrary.tracklist) {
			if (title.equalsIgnoreCase(song.title)) {
				playList.addSongs(title);
				break;
			}
		}		
		return playList;
	}
}