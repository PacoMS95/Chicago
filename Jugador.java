/*Clase Jugador
 * 
 * Propiedades:
 * 
 * > Dinero: int consultable y modificable, básica
 * > Nombre: String consultable y modificable, básica
 * 
 * MÉTODOS Getters y Setters
 * 
 * > int getDinero();
 * > String getNombre();
 * > void setDinero(int dinero);
 * > void setNombre(String nombre);
 * 
 * Métodos añadidos:
 * 
 * > Añadir dinero
 * > Restar dinero
 * > Lanzar dado
 * 
 */


public class Jugador implements Cloneable, Comparable <Jugador>{
	
	//propiedades básicas
	private int dinero;
	private String nombre;
	
	//Métodos constructores
	
	public Jugador(){
		int dinero = 1000;
		String nombre = "Pepito";
		}
	
	public Jugador (Jugador j){
		this.dinero = j.dinero;
		this.nombre = j.nombre;
		}
	
	public Jugador (int dinero, String nombre){
		this.dinero = dinero;
		this.nombre = nombre;
		}
	
	//GETTERS Y SETTERS
	
	public int getDinero(){
	
		return dinero;
		
		}
	
	public String getNombre(){
		
		return nombre;
		}
	
	public void setDinero(int dinero){
		
		this.dinero=dinero;
		}
	
	public void setNombre(String nombre){
		
		this.nombre=nombre;
		}
	
	//MÉTODOS SOBREESCRITOS Y SOBRECARGADOS
	
	@Override
	public String toString(){
		
		String s = "(" + this.nombre + "," + this.dinero + ")";
		return s;
		}
		
	@Override 
	public int hashCode(){
		Double nombreWrapper = new Double (nombre);
		return(nombreWrapper.hashCode());
				
		}//qué cojones acabo de hacer aqui?		
	
	@Override 
	public Jugador clone(){
		Jugador copia = null;
		try{
			copia = (Jugador) super.clone();
			}
		catch(CloneNotSupportedException c){
			System.out.println("Objeto no clonado");
			}
		return copia;
		}
	
	
	/* INTERFAZ
	
	PROCESO: Compara si dos objetos jugador son iguales. Dos objetos jugador son iguales si tienen el mismo nombre.
	
	NOMBRE:equals
	
	PRECONDICIONES: el objeto a comparar con Jugador debe ser de la clase object
	 
	ENTRADA: objeto de la clase object
	
	SALIDA: un booleano
	
	POSTCCONDICIONES: falso si no son iguales, verdadero si lo son
	
	CABECERA: boolean equals(Object o)
	 */
	
	
	
	@Override
	public  boolean equals(Object o){
		boolean igual = false;
		if (o != null && o instanceof Jugador){
		Jugador j = (Jugador) o;
			if(getNombre() == j.getNombre()){
				igual = true;
				}
			}
		return igual;
		}
	
	/* INTERFAZ
	 * 
	 * PROCESO:compara cuál de los dos jugadores a comparar tiene más dinero
	 * 
	 * NOMBRE: compareTo
	 * 
	 * PRECONDICIONES: el jugador debe pertenecer a la clase Jugador
	 * 
	 * ENTRADA: Un jugador de la clase jugador
	 * 
	 * Salida: un entero
	 * 
	 * POSTCONDICIONES: 1 si es mayor, 0 si igual y -1 si es menor
	 * 
	 * CABECERA: int compareTo(Jugador j)
	 * 
	 * */
	
	
	public int compareTo(Jugador j)	{
		int comparacion = 0;
		if (this.getDinero() < j.getDinero()){
			comparacion = -1;
		 }else{
			 if(this.getDinero() > j.getDinero()){
				 comparacion = 1;
				 }
			}
		return comparacion;
		}
	
	//MÉTODOS AÑADIDOS
	
	/* INTERFAZ:
	 * 
	 * PROCESO: se añade una cantidad X a la cartera del jugador y devuelve el valor de la cartera actualizado
	 * 
	 * NOMBRE: aniadirDinero
	 * 
	 * PRECONDICIONES: El valor de entrada debe ser mayor que cero
	 * 
	 * ENTRADA: un número entero
	 * 
	 * SALIDA: un número entero (el valor de la cartera)
	 * 
	 * POSTCONDICIONES: el valor de la cartera será mayor que cuando entró
	 * 
	 * CABECERA: int aniadirDinero (int cantidadAAniadir)
	 * */
	public int aniadirDinero (int cantidadAAniadir){
		
		int carteraActualizada = 0;
		
		carteraActualizada = cantidadAAniadir + dinero;
		
		return carteraActualizada;
		
		}
	
	/* INTERFAZ:
	 * 
	 * PROCESO: se quita una cantidad X a la cartera del jugador y devuelve el valor de la cartera actualizado
	 * 
	 * NOMBRE: quitarDinero
	 * 
	 * PRECONDICIONES: El valor de entrada debe ser mayor que cero
	 * 
	 * ENTRADA: un número entero
	 * 
	 * SALIDA: un número entero (el valor de la cartera)
	 * 
	 * POSTCONDICIONES: el valor de la cartera será menor que cuando entró
	 * 
	 * CABECERA: int quitarDinero (int cantidadAQuitar)
	 * */
	 public int quitarDinero (int cantidadAQuitar){
		
		int carteraActualizada = 0;
		
		carteraActualizada = dinero - cantidadAQuitar;
		
		return carteraActualizada;
		
		}
	 
	 /*
	  * INTERFAZ
	  * 
	  * PROCESO: simula un lanzamiento de dado por parte del jugador
	  * 
	  * NOMBRE: lanzarDado
	  * 
	  * PRECONDICiONES: el número debe estar entre 1 y 6
	  * 
	  * ENTRADA: un número entero
	  * 
	  * SALIDA: ninguna
	  * 
	  * POSTCONDICIONES: ninguna
	  * 
	  * CABECERA: void lanzarDado (int dado)
	  * */
	  
	  public int lanzarDado (){
		  
		  int tirada = 0;
		  
		  Dado d = new Dado();
		  
		  tirada = d.generarTirada();
		  
		  return tirada;
		  

		  }

}	
