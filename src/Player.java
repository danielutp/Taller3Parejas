import java.text.ParseException;

/**
 *Esta es una clase que representa un reproductor que se encarga de reproducir una cancion
 *o implementa un metodo para reproducir una lista de canciones. 
 * @author juanpcs
 * @version 1.0.0  *
 */
public abstract class Player {
	
	/**
	 *Objeto tipo songLibrary. 
	 */
    SongLibrary songLibrary;
    
    /**
     * Metodo contructor que permite instanciar player inicializando su atributo.
     * @throws ParseException 
     */
    public Player() throws ParseException {
        this.songLibrary = new SongLibrary();
    }

    /**
     * Metodo abstracto que se implementa en las clases que heredan.
     * @param song Cancion a reproducir.
     */
    abstract void player(Song song);
    
    /**
     *Metodo que permite reproducir una lista de canciones. 
     */
    public void reproduceLibrary() {
        for (Song song : this.songLibrary.tracklist) {
            player(song);            
        }
    }
}