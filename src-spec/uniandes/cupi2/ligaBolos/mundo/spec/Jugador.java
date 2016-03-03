package uniandes.cupi2.ligaBolos.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* Clase que representa a un jugador perteneciente a la liga de bolos.
*/
public class Jugador extends _Jugador
{

	

	/**
	* Ruta donde se almacena la imagen del jugador.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer rutaImagen;
	/**
	* Nombre del jugador.
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombreJugador;
	/**
	* Flag que indica si el jugador es profesional o no.
	*/
	@Atributo(genGet=true, genSet=true)
	private Boolean jugadorProfesional;
	/**
	* Nombre del equipo de bolos al cual pertenece el jugador.
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombreEquipo;
	/**
	* Total de puntos de juego acumulados por el jugador.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer totalPuntos;
	/**
	* Cantidad de partidas jugadas por el jugador.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer partidasJugadas;
	

	

	/**
	* Retorna el promedio de puntos del jugador, utilizando su total de puntos y la cantidad de partidas jugadas.
	*/
	public Integer darPromedioPuntos()
	{
	
	}
	
	/**
	* Agrega un nuevo puntaje al jugador.
	*/
	public void agregarNuevoPuntaje(String pPuntaje)
	{
	
	}
	
	
}

