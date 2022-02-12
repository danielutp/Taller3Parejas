import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 * Clase que representa un sistema de reproduccion no pago 
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 */
public class PlayerNonPaying extends Player {
	/**
	 * Metodo constructor
	 * @throws ParseException
	 */
	public PlayerNonPaying() throws ParseException {
		super();		
	}
	
	/**
	 *Metodo que extiende de Player para reproducir una cancion con comercial 
	 */
	@Override
	void player(Song song) {
		JOptionPane.showMessageDialog(null,"reproduciendo : " + song.title+"\n"+"reproduciendo Comercial!!!!");
	}
}