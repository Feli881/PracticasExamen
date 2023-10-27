import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		PintarNombre();
	}
	
	private static void PintarNombre(){
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce tu nombre");
		String sNombre=sc.nextLine();
		
		String[]nombreCompleto=sNombre.split(" ");
		
		System.out.println("El nombre completo en mayúsculas es:" +sNombre.toUpperCase());
		System.out.println("La cantidad de letras es: "+sNombre.length());
		
	}
}
