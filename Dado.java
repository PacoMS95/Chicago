/*
 * CLASE Dado
 *
 * Propiedades Basicas
 * 
 *     numeroDeCaras : tipo int, consultable y modificable

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
 *     public int getNumeroDeCaras();
 *     
 *     public void setNumeroDeCaras( int numeroDeCaras ); 
 */
 
 import java.util.Random;
public class Dado implements Cloneable, Comparable<Dado>
{
	//------------------------------- PROPIEDADES ------------------------------------
	//BASICAS
	private int numeroDeCaras;
	private int numeroTirada;

	//PROPIEDADES DERIVADAS
		//NINGUNA

	//PROPIEDADES COMPARTIDAS

	//------------------------------- FIN PROPIEDADES ---------------------------------
	
	//------------------------------- CONSTRUCTORES ----------------------------------
	//CONSTRUCTOR POR DEFECTO
	public void Dado()
	{
		numeroDeCaras = 6;
		numeroTirada = 1;
	}
	
	//CONSTRUCTOR SOBRECARGADO
	public void Dado(int numeroDeCaras, int numeroTirada) throws DadoException
	{
		if ( numeroDeCaras == 6 && numeroTirada >= 1 && numeroTirada <= 6 )
		{
			this.numeroDeCaras = numeroDeCaras;
		    this.numeroTirada = numeroTirada;
		}
		else
		{
			throw new DadoException("El numero de caras del dado debe 6 y la tirada un numero entero entre 1 y 6 ambos inclusive");	
		}	
	}
	
	//CONSTRUCTOR DE COPIA
	public void Dado(Dado dado)
	{
		numeroDeCaras = dado.getNumeroDeCaras();
		numeroTirada = dado.getNumeroTirada();
	}
	//------------------------------- FIN CONSTRUCTORES ---------------------------------

	//------------------------------- METODOS CONSULTORES --------------------------------
    public int getNumeroDeCaras()
    {
    	return numeroDeCaras;
    }
    public int getNumeroTirada()
    {
    	return numeroTirada;
    }
    //------------------------------- FIN METODOS CONSULTORES ----------------------------------
	

    //------------------------------- METODOS MODIFICADORES ----------------------------------
    public void setNumeroDeCaras(int numeroDeCaras) throws DadoException
	{
		if ( numeroDeCaras == 6 )
		{
			numeroDeCaras = numeroDeCaras;
		}
		else
		{
			throw new DadoException("El numero de caras debe ser 6");	
		}	
	}

	public void setNumeroTirada(int numeroTirada) throws DadoException
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
	    toString = numeroDeCaras+","+numeroTirada;
	    return toString; 
	}

    @Override
    public int hashCode()
    {
    	int hashCode = 0;
    	hashCode = numeroDeCaras * numeroTirada / 14 * 2;
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

            if ( numeroDeCaras == dado.getNumeroDeCaras() )
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
	*/
	@Override
	public int compareTo(Dado dado)
    {
        int comparacion;

        if (numeroDeCaras < dado.getNumeroDeCaras())
        {
            comparacion = -1;
        }
        else if (numeroDeCaras > dado.getNumeroDeCaras())
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
