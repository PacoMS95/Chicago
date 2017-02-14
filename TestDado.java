

public class TestDado
{
	public static void main (String[] args) 
	{
		Dado dadoDefecto      = new Dado();
		Dado dadoSobrecargado = null;
		try
		{
			dadoSobrecargado = new Dado(6,6);
		}
		catch (DadoException e)
		{
			System.out.println(e);
		}
		
		Dado dadoCopia        = new Dado(dadoSobrecargado);
		
		System.out.println
		(
			dadoDefecto.toString()+"\n"+
			dadoSobrecargado.toString()+"\n"+
			dadoCopia.toString()+"\n"
		);
		
		System.out.println
		(
			dadoDefecto.getNumeroTirada()+"\n"+
			dadoSobrecargado.getNumeroTirada()+"\n"+
			dadoCopia.getNumeroTirada()+"\n"
		);
		
		System.out.println
		(
			dadoDefecto.compareTo(dadoSobrecargado)+"\n"+
			dadoSobrecargado.compareTo(dadoCopia)+"\n"+
			dadoCopia.compareTo(dadoDefecto)+"\n"	
		);
	}
}

