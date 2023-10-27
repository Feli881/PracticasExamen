import java.util.Scanner;

public class Ejercicio33 
{

	public static void main(String[] args) 
	{
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Por favor, ingrese una fecha :");
	        String fecha = scanner.nextLine();
	        String[] partes = fecha.split("/");

	        if (partes.length != 3) {
	            System.out.println("Formato de fecha incorrecto.");
	            return;
	        }

	        int dia = Integer.parseInt(partes[0]);
	        int mes = Integer.parseInt(partes[1]);
	        int año = Integer.parseInt(partes[2]);

	        if (mes < 1 || mes > 12) {
	            System.out.println("Mes inválido. Debe estar entre 1 y 12.");
	            return;
	        }

	        int maxDia;
	        switch (mes) {
	            case 2:
	                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
	                    maxDia = 29; // Año bisiesto
	                } else {
	                    maxDia = 28;
	                }
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                maxDia = 30;
	                break;
	            default:
	                maxDia = 31;
	        }

	        if (dia < 1 || dia > maxDia) {
	            System.out.println("Día inválido. Para el mes " + mes + ", el día debe estar entre 1 y " + maxDia + ".");
	            return;
	        }

	        System.out.println("La fecha ingresada es válida.");
	}
}
