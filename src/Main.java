import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Esto es un sistema de reproduccion de musica con sus caractisticas correspondientes.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 *
 */
public class Main{	
    public static void main(String[] args) throws ParseException{     	
        int opcion = 0;
    	int number = 0;
    	do{
    		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de reproduccion de musica\n"+
    		    	"Ingrese la opcion 1 para entrar al reproductor premium pago"+"\n"+
    				"Ingrese la opcion 2  para entrar al reproductor no pago\n"+
    		    	"Ingrese la opcion 3 para salir del sistema"));
    		/**
    		 * Se crean los casos para la reproduccion de canciones segund el tipo de reproductor premium o no premium
    		 */
    	
    	switch(opcion){	
    	
    	case 1 :
    		number = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema de reproduccion de musica\n"+"\n"+
    				"Ingrese la opcion 1 para crear una playlist\n"+"Ingrese la opcion 2 para filtrar la playlist por genero\n"+
    				"Ingrese la opcion 3 para filtrar por la playlist por fecha\n"+
    		        "Ingrese la opcion 4 para para salir del sistema\n"));
    			switch(number){	        	
			            case 1 :
			        		PlayerPaid playerpaid = new PlayerPaid();			        					        		
			        		PlayList playList =  playerpaid.createPlayList();
			        		playerpaid.player(playList);
			        		playList = playerpaid.songLibrary.orderLonger(playList);
			        		JOptionPane.showMessageDialog(null, "La lista ordenada es : \n");
			        		for (String song : playList.tracklist) {
			        			JOptionPane.showMessageDialog(null,"La cancion ordenada : " + song);								
							}break;	 			                
			            case 2 :
			            	SongLibrary library = new SongLibrary();
			            	String gender = JOptionPane.showInputDialog("Introduzca el genero que desea filtrar\n");
			            	ArrayList<Song> filterlist = library.filterByGender(gender);
			            	for (Song song : filterlist) {
			            		JOptionPane.showMessageDialog(null,"La cancion filtrada con el genero es : " + song.title);
							}break;
			            case 3 :
			            	SongLibrary library1 = new SongLibrary();			            	
			            	String date = JOptionPane.showInputDialog("Introduzca la fecha que desea filtrar\n");
			            	Date date1 = library1.stringToDate(date);
			            	ArrayList<Song> filterlist1 = library1.filterByDate(date1);
			            	for (Song song : filterlist1) {
			            		JOptionPane.showMessageDialog(null,"La cancion filtrada por la fecha es : " + song.title);
			            	}break;
			            case 4:
			            	JOptionPane.showMessageDialog(null,"Has finalizado el reproductor de musica Premiun pago");
			            	break;	            	
			            default:
			            	JOptionPane.showMessageDialog(null,"no coincide");
			                break;	                
			        		}
    						break;    			
    	case 2 :
    		JOptionPane.showMessageDialog(null,"Bienvenido al sistema de reproduccion de musica no pago\n"+
    	    "Este reproducira las canciones en una playlist ya creada con publicidad ");    		
    		PlayerNonPaying playernonpaying = new PlayerNonPaying();
    		playernonpaying.reproduceLibrary();    		
    		break;
    	case 3 :
         	JOptionPane.showMessageDialog(null,"Has finalizado el reproductor de musica");
         	break;
    	default:
        	JOptionPane.showMessageDialog(null,"no coincide");
            break;	 
    	 }
	     }while(opcion!=3);	
   }	
}