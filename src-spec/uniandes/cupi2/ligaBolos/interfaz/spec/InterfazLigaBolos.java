package uniandes.cupi2.ligaBolos.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.ligaBolos.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "LigaBolos")
public class InterfazLigaBolos extends _InterfazLigaBolos
{

	

	

	/**
	* Panel de la imagen encabezado.
	*/
	private PanelImagen panelImagen;
	
	/**
	* Clase principal del mundo.
	*/
	private LigaBolos ligaBolos;
	
	/**
	* Panel de opciones.
	*/
	private PanelOpciones panelOpciones;
	
	

	/**
	* Ventana principal de la interfaz gráfica.
	*/
	public InterfazLigaBolos()
	 {

	 }


	/**
	* <span style="font-size: 12.8px;">Visualiza el último jugador en pantalla.</span>
	*/
	public void irAUltima()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Visualiza el primer jugador en pantalla.</span>
	*/
	public void irAPrimero()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Visualiza el anterior jugador en pantalla.</span>
	*/
	public void irAtras()
	{
	
	}
	
	/**
	* Agrega un nuevo puntaje al jugador presentado en pantalla.
	*/
	public void agregarPuntaje()
	{
	
	}
	
	/**
	* Visualiza el siguiente jugador en pantalla.
	*/
	public void irAdelante()
	{
	
	}
	
	/**
	* Busca un jugador por su nombre.
	*/
	public void buscarJugadorPorNombre()
	{
	
	}
	
	/**
	* actualiza los elementos de la ventana principal de la interfaz.
	*/
	public void actualizar()
	{
	
	}
	
	



    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = ligaBolos.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = ligaBolos.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
    * Este método ejecuta la aplicación, creando una nueva interfaz.
    * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
    */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazLigaBolos interfaz = new InterfazLigaBolos( );
        interfaz.setVisible( true );
    }
}
