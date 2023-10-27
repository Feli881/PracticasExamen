import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		
		PintarNombre();
	}
	private static void PintarNombre()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nombre"); 
		String nombre=sc.nextLine();
		
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		
		for (int i=0; i<num; i++)
		{
			System.out.println(nombre);
		}
	}

}
