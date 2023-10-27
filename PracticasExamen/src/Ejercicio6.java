import java.util.Scanner;

public class Ejercicio6 {
static String sFrase; 
static String sLetra; 
	public static void main(String[] args) {
		PedirDatos();
		PintarLetras();
	}
	
	private static void PedirDatos()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase");
		sFrase=sc.nextLine();
		
		System.out.println("Introduce una letra");
		sLetra=sc.nextLine();
		sc.close();
	}
	
	private static void PintarLetras()
	{
		String sLetraMay=sLetra.toUpperCase();
		sFrase=sFrase.replace(sLetra, sLetraMay);
		System.out.println(sFrase);
	}

}
