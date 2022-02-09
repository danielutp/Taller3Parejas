import java.util.Date;

/**
 * Clase abstracta que representa una cancion, sus atributos y algunos metodos.
 * @author juanpcs
 *
 */
abstract class Song {
	
	/**
	 * Atributo tipo String que representa el titulo de la cancion.
	 */
	public String title;
	
	/**
	 * Atributo tipo entero que represetan el identificador de la cancion;
	 */
	private int id;
	
	/**
	 * Atributo tipo date que representa la fecha de la cancion.
	 */
	public Date date;
	
	/**
	 * Atributo tipo flotante que representa la duracion de la cancion;
	 */
	public float duration;
	
	/**
	 * Atributo tipo String que representa el genero de la cancion;
	 */
	public String genre;
	
	/**
	 * Atributo tipo String que representa la caratula de la cancion;
	 */
	public String cover;
	
	/**
	 * Atributo tipo String que representa una breve descripcion de la cancion;
	 */
	public String description;
	
	/**
	 * Metodo constructor que permite instanciar la clase sin inicializar sus atributos.
	 */
	public Song() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo constructor que permite instanciar la clase inicializando cada uno de sus atributos.
	 * @param title Titulo de la cancion.
	 * @param id Id de la cancion.
	 * @param date Fecha de la cancion.
	 * @param duration Duracion de la cancion.
	 * @param genre Genero de la cancion.
	 * @param cover Caratula de la cancion.
	 * @param description Breve descripcion de la cancion.
	 */
	public Song(String title, int id, Date date, float duration, String genre, String cover, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date = date;
		this.duration = duration;
		this.genre = genre;
		this.cover = cover;
		this.description = description;
	}
	
	/**
	 * Metodo accesor que permite obtener el titulo de la instancia actual de cancion.
	 * @return Titulo de la cancion.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Metodo accesor que permite modificar el titulo de la instanacia actual de cancion.
	 * @param title Titulo de la cancion.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Metodo accesor que permite obtener el id de la instancia actual de cancion.
	 * @return Id de la cancion.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo accesor que permite modificar el id de la instancia actual de cancion.
	 * @param id Id de la cancion.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Metodo accesor que permote obtener la fecha de la instancia actual de cancion.
	 * @return Fecha de la cancion.
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Metodo accesor que permite modificar la fecha de la instancia actual de cancion.
	 * @param date Fecha de la cancion.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Metodo accesor que permite obtener la duracion de la instancia actual de cancion.
	 * @return Duracion de la cancion.
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Metodo accesor que permite modificar la duracion de la instancia actual de cancion.
	 * @param duration Duracion de la cancion.
	 */
	public void setDuration(float duration) {
		this.duration = duration;
	}

	/**
	 * Metodo accesor que permite obtener el genero de la instancia actual de cancion.
	 * @return Genero de la cancion.
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Metodo accesor que permite modificar el genero de la instancia actual de cancion.
	 * @param genre Genero de la cancion.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Metodo accesor que permite obtener la caratula de la instancia actual de cancion.
	 * @return Caratula de la cancion.
	 */
	public String getCover() {
		return cover;
	}

	/**
	 * Metodo accesor que permite modificar la caratula de la instancia actual de cancion.
	 * @param cover Caratula de la cancion.
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * Metodo accesor que permite obtener la descripcion de la instancia actual de cancion.
	 * @return Descripcion de la cancion.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Metodo accesor que permite modificar la descripcion de la instancia actual de cancion.
	 * @param description Descripcion de la cancion.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
