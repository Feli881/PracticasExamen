import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		PedirFecha();
	}
	private static void PedirFecha()
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Por favor, ingresa una fecha :");
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
	            System.out.println("Mes inválido.");
	            return;
	        }
	        
	        int maxDia = 31;
	        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            maxDia = 30;
	        } else if (mes == 2) {
	            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
	                maxDia = 29;
	            } else {
	                maxDia = 28;
	            }
	        }
	        
	        if (dia < 1 || dia > maxDia) {
	            System.out.println("Día inválido.");
	            return;
	        }
	        
	        System.out.println("La fecha es válida.");
	    }
		
	}


	


