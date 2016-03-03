package uniandes.cupi2.ligaBolos.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* Panel con la información del jugador actual.
*/
@UIPanel
public class PanelJugador extends _PanelJugador
{
	

	/**
	* Campo de texto para el promedio de puntos del jugador.
	*/
	@UITextField(nombre = " PromedioPuntos ", enabled = true)
	private JTextField txtPromedioPuntos;
	
	/**
	* Campo de texto para el nombre del equipo.
	*/
	@UITextField(nombre = " NombreEquipo ", enabled = true)
	private JTextField txtNombreEquipo;
	
	/**
	* Etiqueta para los resultados.
	*/
	@UILabel(nombre = " Resultados ")
	private JLabel lblResultados;
	
	/**
	* Panel que contiene los datos del jugador actual.
	*/
	private JPanel PanelInformacionJugador; 	
	
	/**
	* Panel que contiene la imagen del jugador actual.
	*/
	private JPanel PanelImagenJugador; 	
	
	/**
	* Botón para ir al anterior jugador.
	*/
	@UIBoton( comando = " ", label = " ", metodo = )
	private JButton btnAnterior;
	
	/**
	* Botón para ir al primer jugador.
	*/
	@UIBoton( comando = " ", label = " ", metodo = )
	private JButton btnPrimero;
	
	/**
	* Botón para ir al siguiente jugador.
	*/
	@UIBoton( comando = " ", label = " ", metodo = )
	private JButton btnSiguiente;
	
	/**
	* Campo de texto para la cantidad de partidas jugadas.
	*/
	@UITextField(nombre = " PartidasJugadas ", enabled = true)
	private JTextField txtPartidasJugadas;
	
	/**
	* Etiqueta para la imagen del jugador.
	*/
	@UILabel(nombre = " Imagen ")
	private JLabel lblImagen;
	
	/**
	* Campo de texto para el nombre del jugador.
	*/
	@UITextField(nombre = " NombreJugador ", enabled = true)
	private JTextField txtNombreJugador;
	
	/**
	* Panel que contiene los botones de navegación entre jugadores.
	*/
	private JPanel PanelNavegacion; 	
	
	/**
	* Botón para ir al ultimo jugador.
	*/
	@UIBoton( comando = " ", label = " ", metodo = )
	private JButton btnUltimo;
	
	

	/**
	* Inicializa el panel de información del jugador.
	*/
	public void inicializarPanelInformacionJugador()
	{
	
	}
	
	/**
	* Inicializa el panel de navegación.
	*/
	public void inicializarPanelNavegacion()
	{
	
	}
	
	/**
	* Inicializa el panel de imagen del jugador.
	*/
	public void inicializarPanelImagenJugador()
	{
	
	}
	
	/**
	* Actualiza los elementos presentes en el panel de jugador.
	*/
	public void actualizar(Jugador pJugador)
	{
	
	}
	
	

} 
