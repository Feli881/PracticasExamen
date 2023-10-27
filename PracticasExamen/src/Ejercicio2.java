import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
		PintarNombre(); 
		
	}
	private static void PintarNombre()
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre completo:");
        String nombreCompleto = scanner.nextLine();

        System.out.println("Nombre en minúsculas: " + nombreCompleto.toLowerCase());
        System.out.println("Nombre en mayúsculas: " + nombreCompleto.toUpperCase());

        String[] partes = nombreCompleto.split(" ");
        for (int i = 0; i < partes.length; i++) {
            partes[i] = partes[i].substring(0, 1).toUpperCase() + partes[i].substring(1).toLowerCase();
        }
        System.out.println("Nombre con la primera letra en mayúscula: " + String.join(" ", partes));
    }
	
}
