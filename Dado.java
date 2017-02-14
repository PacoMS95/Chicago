/*
 * CLASE Dado
 *
 * Propiedades Basicas
 * 
 *     numeroCaras   : tipo int, consultable y modificable
 *     numeroTirada  : tipo int, consultable
 *
 * Propiedades Derivadas
 *     NINGUNA
 * 
 * Propiedades Compartidas
 *     NINGUNA
 *
 * Restricciones
 *     El numero de caras debe ser 6
 *
 * Comentarios
 * 
 * Interfaz:
 * 
 *     //METODOS CONSULTORES
 *     public int  getNumeroCaras();
 *     public int  getNumeroTirada();
 *
 *     //METODOS MODIFICADORES
 *     private void setNumeroCaras( int numeroCaras );
 *     private void setNumeroTirada( int numeroTirada ); 
 *
 *     //METODOS AÑADIDOS
 *     public int generarTirada();
 */
 
import java.util.Random;
public class Dado implements Cloneable, Comparable<Dado>
{
	//------------------------------- PROPIEDADES ------------------------------------
	//BASICAS
	private int numeroCaras;
	private int numeroTirada;

	//PROPIEDADES DERIVADAS
		//NINGUNA

	//PROPIEDADES COMPARTIDAS
	    //NINGUNA

	//------------------------------- FIN PROPIEDADES ---------------------------------
	
	//------------------------------- CONSTRUCTORES ----------------------------------
	//CONSTRUCTOR POR DEFECTO
	public Dado()
	{
		numeroCaras = 6;
		numeroTirada = 1;
	}
	
	//CONSTRUCTOR SOBRECARGADO
	public Dado(int numeroCaras, int numeroTirada) throws DadoException
	{
		if ( numeroCaras == 6 && numeroTirada >= 1 && numeroTirada <= 6 )
		{
			this.numeroCaras  = numeroCaras;
		    this.numeroTirada = numeroTirada;
		}
		else
		{
			throw new DadoException("El numero de caras del dado debe 6 y la tirada un numero entero entre 1 y 6 ambos inclusive");	
		}	
	}
	
	//CONSTRUCTOR DE COPIA
	public Dado(Dado dado)
	{
		numeroCaras   = dado.getNumeroCaras();
		numeroTirada  = dado.getNumeroTirada();
	}
	//------------------------------- FIN CONSTRUCTORES ---------------------------------

	//------------------------------- METODOS CONSULTORES --------------------------------
    public int getNumeroCaras()
    {
    	return numeroTirada;
    }
    public int getNumeroTirada()
    {
    	return numeroTirada;
    }
    //------------------------------- FIN METODOS CONSULTORES ----------------------------------
	

    //------------------------------- METODOS MODIFICADORES ----------------------------------
    public void setNumeroCaras(int numeroCaras) throws DadoException
	{
		if ( numeroCaras == 6 )
		{
			this.numeroCaras = numeroTirada;
		}
		else
		{
			throw new DadoException("El numero de caras debe ser 6");	
		}	
	}

	private void setNumeroTirada(int numeroTirada) throws DadoException
	{
		if ( numeroTirada >= 1 && numeroTirada <= 6 )
		{
			this.numeroTirada = numeroTirada;
		}
		else
		{
			throw new DadoException("La tirada debe ser entre 1 y 6");	
		}
	}
    //------------------------------- FIN METODOS MODIFICADORES ----------------------------------

    //------------------------------- METODOS SOBRESCRITOS ------------------------------------
	@Override
	public String toString()
	{
		String toString;
	    toString = numeroCaras+","+numeroTirada;
	    return toString; 
	}

    @Override
    public int hashCode()
    {
    	int hashCode = 0;
    	hashCode = numeroCaras * numeroTirada / 14 * 2;
    	return hashCode;
    }
    
    @Override
    public Dado clone()
    {
    	Dado clonDado = null;

    	try
    	{
    		clonDado = (Dado) super.clone();
    	}
    	catch (CloneNotSupportedException error)
    	{
    		System.out.println("Error clonado el objeto dado\n"+error);
    	}

    	return clonDado;
    }

	/* INTERFAZ	
	 * Cabecera:        
	 *     public boolean equals(Object object)
	 *     
	 * Descripcion:    
	 *     Comprueba si el objeto pasado por parametro es igual que el objeto que 
	 *     lanza el metodo
	 *     
	 * Precondiciones: 
	 *     Ninguna
	 *     
	 * Entradas:    
	 *     Un objeto
	 *     
	 * Salidas:		
	 *     Un booleano
	 *     
	 * Postcondiciones:
	 *     Devolvera VERDADERO si los objetos son iguales y FALSO cuando no lo sean
	 *     Los objetos seran iguales cuando tengan el mismo numero de caras el
	 *     objeto que realiza la llamada al metodo y el objeto pasado por parametro
	*/
	@Override
    public boolean equals(Object object)
    {
        boolean sonIguales = false;

        if (object != null && object instanceof Dado)
        {
            Dado dado = (Dado) object;

            if ( numeroTirada == dado.getNumeroTirada() )
            {
            	sonIguales = true;
            }
        }
        return sonIguales;
    }
	
	/* INTERFAZ	
	 * Cabecera:
	 *     public int compareTo(Dado Dado)
	 *     
	 * Descripcion:
	 *     Compara un objeto con otro
	 *     
	 * Precondiciones:  
	 *     Ninguna
	 *     
	 * Entradas:       
	 *     Un objeto tipo Dado
	 *     
	 * Salidas:		 
	 *     Un entero
	 *     
	 * Postcondiciones:
	 *     Devolvera -1 cuando sea menor, 0 cuando sean iguales, 1 cuando sea mayor 
	 *     Se comparara el numero de la tirada del dado
	*/
	@Override
	public int compareTo(Dado dado)
    {
        int comparacion;

        if (numeroTirada < dado.getNumeroTirada())
        {
            comparacion = -1;
        }
        else if (numeroTirada > dado.getNumeroTirada())
        {
        	comparacion = 1;
        }
        else
        {
            comparacion = 0;
        }
        return comparacion;
    }
	//------------------------------- FIN METODOS SOBRESCRITOS ----------------------------------

	//------------------------------- FIN METODOS AÑADIDOS ----------------------------------
	public int generarTirada()
	{
		Random random = new Random();
		int rango = 6 - 1 + 1;
		int numeroAleatorio =  random.nextInt(rango) + 1;
		numeroTirada = numeroAleatorio;
		return(numeroAleatorio);
	}

	//------------------------------- FIN METODOS AÑADIDOS ----------------------------------
}
