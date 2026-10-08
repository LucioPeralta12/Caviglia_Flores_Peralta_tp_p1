package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Delivery Rush", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		entorno.colorFondo(Color.GRAY);
		entorno.dibujarRectangulo(120, 100, 100, 100, 0, Color.GREEN);
		entorno.dibujarRectangulo(250, 100, 100, 100, 0, Color.GREEN);
		entorno.dibujarRectangulo(400, 100, 100, 100, 0, Color.GREEN);
		entorno.dibujarRectangulo(550, 100, 100, 100, 0, Color.GREEN);
		entorno.dibujarRectangulo(700, 100, 100, 100, 0, Color.GREEN);
		entorno.dibujarRectangulo(400, 300, 800, 40, 0, Color.DARK_GRAY);
		// ...
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
