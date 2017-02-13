/*
Juego Chicago:
*
* VÉASE LA DESCRIPCIÓN DEL JUEGO EN EL FOLIO A COLOR "BOLETIN DE NAVIDAD"
* 
* TENER EN CUENTA:

1º Seguir la metodología que se sigue en clase (véase en tema 5 la metodología que hay que seguir)
2º Manejar excepciones si surgiesen en un programa a parte (fijarse en proyecto de 11ivan)
3º Crear una clase de utilidades separada con métodos que vayan a ser usados tanto en este programa como en otro. ESTE DEBE INCLUiR RESGUARDOS, CONDUCTORES Y, POR SUPUESTO, LA FUNCIONALIDAD EN Si
4º Seguir las directrices de la POO, es decir, primero hacer los objetos que convengan y luego implementarlos en el PP
5º Seguir las normas de cohesión y acoplamiento aprendidas
6º En el PP solo deben aparecer: llamadas, alguna validación y lecturas. PP LIMPITO!
7º El proceso completo podrá ejecutarse más de una vez
8º Se deben de validar todas las entradas posibles
* 
* ANALISIS:
* 
* Autores: 
* > Francisco Mendoza Sánchez
* > Paulo Gustavo Soares Teixeira
*  
* Proceso: 
* 
* > Se trata de un juego de dados, donde el que saca la puntuación más alta gana la apuesta. bLA BLA BLA. El resto viene en el enunciado
* y no pienso copiarlo.
* 
* Entradas:
* 
* > El usuario podrá introducir su nombre (cadena de carácteres)// comentar esto entre paréntesis a Paulo.
* > Además, el usuario podrá introducir un entero que representará la cantidad apostada.
* 
* Salidas:
* 
* > Los resultados de la tirada de los dados (int) por pantalla
* > Distintos mensajes (String) por pantalla, como quién es el ganador, en qué ronda nos encontramos (etc)
* 
* Clases:
* > Clase persona, de la cuál nos interesa su nombre y cuánto dinero tiene (Paco)
* > Clase dado, de la cuál nos interesa saber su número en cada tirada (Paulo)
* 
* Pseudocódigo generalizado del programa principal
* 
* INICIO
* 		Hacer
* 			Preguntar y leer el nombre del jugador
* 			Determinar quién tira primero
* 			Pedir cuánto apostar
* 			Jugar y determinar ganador del pozo
* 			Pedir si repetir
* 		Mientras el usuario quiera
* FIN_PP
* 
* 
* PSEUDOCÓDIGO DETALLADO ('*' determina qué módulos se convertirán en subprogramas)
* 
* INICIO
* 		Hacer
* 
* 			Preguntar nombre del jugador
* 			Leer nombre del jugador *
* 			Lanzar dado y determinar quien tirará primero *
* 			Leer cuánto se apuesta //Si se apuesta más de lo que se tiene en el monedero, lanzar excepción
* 
* 			Hacer
* 				Mostrar numero clave de la ronda
* 				Tirar el dado *
* 				Si hubo ganador
* 					Mostrar el ganador de la ronda
* 				Sino
* 					Hacer
* 						Tirar dado para Jugador *
* 						Tirar dado para el ordenador *
* 					Mientras ninguno saque el numero clave de la ronda
* 
* 				Sumar punto al ganador
* 
* 			Mientras no se llegue a la ronda 11
* 			
* 			Mostrar ganador del juego
* 
* 			Si el ganador fue el Jugador
* 				Añadir pozo al monedero
* 			Sino
* 				Mostrar "Haber estudiao"
* 
* 			Pedir si repetir
* 
* 		Mientras el usuario quiera
* 
* FIN_PP
* 
* 
* 
* 
 */


public class chicago {
	
	public static void main (String[] args) {
		

 		//Hacer
 
 			//Preguntar nombre del jugador
 			//Leer nombre del jugador *
 			//Lanzar dado y determinar quien tirará primero *
 			//Leer cuánto se apuesta //Si se apuesta más de lo que se tiene en el monedero, lanzar excepción
 
 			//Hacer
 				//Mostrar numero clave de la ronda
 				//Tirar el dado *
 				//Si hubo ganador
 					//Mostrar el ganador de la ronda
 				//Sino
 					//Hacer
 						//Tirar dado para Jugador *
 						//Tirar dado para el ordenador *
 					//Mientras ninguno saque el numero clave de la ronda
 
 				//Sumar punto al ganador
 
 			//Mientras no se llegue a la ronda 11
 			
 			//Mostrar ganador del juego
 
 			//Si el ganador fue el Jugador
 				//Añadir pozo al monedero
 			//Sino
 				//Mostrar "Haber estudiao"
 
 			//Pedir si repetir
 
 		//Mientras el usuario quiera
 

		
		
		
	}
}// FIN_PP
