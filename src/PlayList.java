/**
 * Clase que representa playlist, sus atributos y algunos metodos para acceder y modificar los mismos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 */
import java.util.ArrayList;

public class PlayList {
	/**
	 * Atributo tipo ArrayList<String> que representa una lista de canciones tracklist.
	 */
	ArrayList<String> tracklist;	
	
	/**
	 * Metodo constructor.
	 * @param tracklist
	 */
	public PlayList() {
		this.tracklist = new ArrayList<String>();
	}

	/**
	 * Metodo accesor que permite obtener un ArrayList<String> de la lista de canciones.
	 * @return tracklist.
	 */
	public ArrayList<String> gettracklist() {
		return tracklist;
	}
	
	/**
	 * Metodo accesor que permite modificar ArrayList<String> de la lista de canciones.
	 * @param tracklist.
	 */
	public void settracklist(ArrayList<String> tracklist) {
		this.tracklist = tracklist;
	}
	
	/**
	 * Metodo para añadir una cancion a la lista de canciones
	 * @param song
	 */
	public void addSongs(String song) {
		this.tracklist.add(song);
	}


}
