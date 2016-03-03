package uniandes.cupi2.ligaBolos.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
@Mundo
public class LigaBolos extends _LigaBolos
{
	

	/**
	* Indice del jugador cuya información se presenta actualmente en pantalla
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer jugadorActual;
	

	/**
	* lista de jugadores inscritos en la liga de bolos.
	*/
	private ArrayList jugadores;
	
	

	/**
	* <span style="font-size: 12.8px;">Retorna el último jugador de la lista de jugadores registrados en la liga de bolos.</span>
	*/
	public Jugador darUltimoJugador()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Busca y retorna un jugador por su nombre.</span>
	*/
	public Jugador darJugadorPorNombre(String pNombre)
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Retorna el siguiente jugador (al jugador actual) de la lista de jugadores registrados en la liga de bolos.</span>
	*/
	public Jugador darSiguienteJugador()
	{
	
	}
	
	/**
	* Busca y retorna el jugador con el mejor promedio de puntos.
	*/
	public Jugador darJugadorMejorPromedio()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Retorna el jugador actual de la lista de jugadores registrados en la liga de bolos.</span>
	*/
	public Jugador darJugadorActual()
	{
	
	}
	
	/**
	* Retorna el primer jugador de la lista de jugadores registrados en la liga de bolos.
	*/
	public Jugador darPrimerJugador()
	{
	
	}
	
	/**
	* <div>Retorna la cantidad de jugadores disponibles en la liga de bolos</div><div><br></div>
	*/
	public Integer darCantidadJugadores()
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Agrega un nuevo puntaje de juego al jugador actual.</span>
	*/
	public void agregarPuntaje(Integer pPuntaje)
	{
	
	}
	
	/**
	* <span style="font-size: 12.8px;">Retorna el anterior jugador (al jugador actual) de la lista de jugadores registrados en la liga de bolos.</span>
	*/
	public Jugador darAnteriorJugador()
	{
	
	}
	
	
}
