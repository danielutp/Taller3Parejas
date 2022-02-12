import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * Clase que representa una cancion, sus atributos y algunos metodos para acceder y modificar los mismos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 *
 */

public class SongLibrary {
	/**
	 * Atributo tipo ArrayList que representa una lista de canciones.
	 */
	ArrayList<Song> tracklist;
	 /**
	  * Metodo constructor que permite instanciar la clase inicializado cada uno de sus atributos.
	  * @throws ParseException
	  */
	public SongLibrary() throws ParseException {
		this.tracklist = populateLibrary();
	}
	
	/**
	 * Metodo constructor que permite instanciar la clase inicializado cada uno de sus atributos.
	 * @param tracklist
	 */
	public SongLibrary(ArrayList<Song> tracklist) {
		this.tracklist = tracklist;
	}
	
	/**
	 * Metodo accesor que permite obtener tracklist de la instancia actual de cancion.
	 * @return tracklist
	 */
	public ArrayList<Song> gettracklist() {
		return tracklist;
	}
	
	/**
	 * Metodo accesor que permite modificar tracklist de la instancia .
	 * @return tracklist
	 */
	public void settracklist(ArrayList<Song> tracklist) {
		this.tracklist = tracklist;
	}
	
	/**
	 * Metodo para añadir una cancion de una tracklist
	 * @param song
	 */
	public void addSong(Song song) {
		tracklist.add(song);
	}
	
	/**
	 * Metodo para crear una lista de canciones por defecto
	 * @return songList 
	 * @throws ParseException
	 */
	private ArrayList<Song> populateLibrary() throws ParseException {
		ArrayList<Song> songList = new ArrayList<Song>();
		Song song = new Song("Rockstar", 1,"2018/08/27", 1.2f, "Rock", "Caratula", "Excelente cancion");
		Song song1 = new Song("Genius", 1, "2019/08/27", 2.3f, "Pop", "Caratula", "Cancion de una excelente artista");
		Song song2 = new Song("Humble", 1, "2017/08/27", 4.20f, "Rap", "Caratula", "Cancion de hace critica a EEUU");
		Song song3 = new Song("Lose Yourself", 1, "2002/08/27", 1.1f, "Rap", "Caratula", "clasico de eminem ");
		Song song4 = new Song("Patience", 1, "1988/08/27", 7.26f, "Rock", "Caratula", "clasico de rock");
		songList.add(song);
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		songList.add(song4);
		return songList;
	}
	
	/**
	 * Metodo para filtrar una lista de canciones por el genero deseado
	 * @param gender
	 * @return filteredList la lista filtrada
	 */
	public ArrayList<Song> filterByGender(String gender) {
		ArrayList<Song> filteredList = new ArrayList<Song>();

		for (Song song : tracklist) {
			if (song.gender.equalsIgnoreCase(gender)) {
				filteredList.add(song);
			}
		}
		return filteredList;
	}
	
	/**
	 * Metodo para filtrar por la fecha deseada
	 * @param date
	 * @return filteredList1 la lista filtrada
	 */
	public ArrayList<Song> filterByDate(Date date) {
		ArrayList<Song> filteredList1 = new ArrayList<Song>();
			for (Song song : tracklist) {
				System.out.println(song.date);
				System.out.println(date);
				if (song.date.equals(date)) {
				filteredList1.add(song);
			}
		}
			return filteredList1;
	}
	
	/**
	 * Metodo para convertir una fecha de tipo String a Date
	 * @param stringdate
	 * @return date
	 * @throws ParseException
	 */
	public Date stringToDate(String stringdate) throws ParseException {
		Date date = new Date();
		String pattern = "yyyy/MM/dd"; 
		SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
		date = format.parse(stringdate);
		return date;		
	}	
	
	/**
	 * Metodo para ordenar una playlist  ya sea por tamaño de la cancion o fecha
	 * @param songList
	 * @return songList la nueva playlist filtrada
	 */
	public PlayList orderLonger(PlayList songList) {
		ArrayList<Song> tempList = new ArrayList<Song>();
		ArrayList<String> temp = new ArrayList<String>();
		for (Song song : this.tracklist) {

			for (String title : songList.tracklist) {
				if (title.equalsIgnoreCase(song.title)) {
					tempList.add(song);
				}
			}
		}
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa 1 para ordenar por el tamaño de la cancion\n"
				+ "Ingresa 2 para ordenar por el fecha de la cancion\n"));
		if (opcion == 1) {
			Collections.sort(tempList, new Comparator<Song>() {
				@Override
				public int compare(Song f1, Song f2) {
					if (f1.last < f2.last) {
						return 1;
					}
					if (f1.last > f2.last) {
						return -1;
					}
					return 0;
				}
			});
		} else {

			Collections.sort(tempList, new Comparator<Song>() {
				@Override
				public int compare(Song f1, Song f2) {
					return f1.date.compareTo(f2.date);					
				}
			});
		}

		for (Song song : tempList) {
			temp.add(song.title);
		}
		songList.tracklist = temp;
		return songList;
	}
}