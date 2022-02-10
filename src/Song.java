/**
 * Clase que representa una cancion, sus atributos y algunos metodos para acceder y modificar los mismos.
 * @author juanpcs
 *
 */
public class Song {
	
	/**
	 * Atributo tipo String que representa el titulo de la cancion.
	 */
	String title;
	
	/**
	 * Atributo tipo entero que representa el identificador de la cancion.
	 */
	int id;
	
	/**
	 * Atributo tipo String que representa la fecha de la cancion.
	 */
	String date;
	
	/**
	 * Atributo tipo flotante que representa la duracion de la cancion.
	 */
	float last;
	
	/**
	 * Atributo tipo String que representa el genero de la cancion.
	 */
	String gender;
	
	/**
	 * Atributo tipo String que representa la caratula de la cancion.
	 */
	String portRait;
	
	/**
	 * Atributo tipo String que representa una breve descripcionde la cancion.
	 */
	String description;	
	
	/**
	 * Metodo constructor que permite instanciar la clase inicializado cada uno de sus atributos.
	 * @param title Titulo de la cancion.
	 * @param id Identificador de la cancion.
	 * @param date Fecha de la cancion.
 	 * @param last Duracion de la cancion.
	 * @param gender Genero de la cancion.
	 * @param portRait Portada de la cancion.
	 * @param description Descripcion de la cancion.
	 */
	public Song(String title, int id, String date, float last, String gender, String portRait, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date = date;
		this.last = last;
		this.gender = gender;
		this.portRait = portRait;
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
	 * Metodo accesor que permite modificar el titulo de la instancia actual de cancion.
	 * @param title Titulo de la cancion.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Metodo accesor que permite obtener el Id de la instancia actual de cancion.
	 * @return Id de la cancion.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Metodo accesor que permite modificar el Id de la instancia actual de cancion.
	 * @param id Id de la cancion.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Metodo accesor que permite obtener la fecha de la instancia actual de cancion.
	 * @return Fecha de la cancion.
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Metodo accesor que permite modificar la fecha de la instancia actual de cancion.
	 * @param date Fecha de la cancion.
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Metodo accesor que permite obtener la duracion de la instancia actual de cancion.
	 * @return Duracion de la cancion.
	 */
	public float getLast() {
		return last;
	}
	
	/**
	 * Metodo accesor que permite modificar la duracion de la instancia actual de cancion.
	 * @param last Duracion de la cancion.
	 */
	public void setLast(float last) {
		this.last = last;
	}
	
	/**
	 * Metodo accesor que permite obtener el genero de la instancia actual de cancion.
	 * @return Genero de la cancion.
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Metodo accesor que permite modificar el genero de la instancia actual de cancion.
	 * @param gender Genero de la cancion.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Metodo accesor que permite obtener la portada de la instancia actual de cancion.
	 * @return Portada de la cancion.
	 */
	public String getPortRait() {
		return portRait;
	}
	
	/**
	 * Metodo accesor que permite modificar la portada de la instancia actual de cancion.
	 * @param portRait Portada de la cancion.
	 */
	public void setPortRait(String portRait) {
		this.portRait = portRait;
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
