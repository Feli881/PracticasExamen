import java.util.Scanner;

public class Ejercicio7 {
static String correo; 
	public static void main(String[] args) {
		PedirDato();
		CambioArroba();
	}

	private static void CambioArroba() {
		int indiceArroba=correo.indexOf('@');
		if (indiceArroba!=-1)
		{
			String nuevoCorreo=correo.substring(0, indiceArroba)+"@laarboleda.es ";
			  System.out.println("Nuevo correo electrónico: " + nuevoCorreo);
        } else {
            System.out.println("El texto introducido no es un correo electrónico válido.");
        }
	}
		
	

	private static void PedirDato() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor, introduce un email");
		correo=sc.nextLine();
		sc.close(); 
	}
	
	

}
