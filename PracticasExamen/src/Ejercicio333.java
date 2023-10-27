import java.util.Scanner;

public class Ejercicio333 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean entradaValida=false; 
		
		while(!entradaValida)
		{
			System.out.println("Por favor, introduzca una fecha");
			String fecha=sc.nextLine();
			
			String[] partes=fecha.split("/");
			if(partes.length!=3)
			{
				System.out.println("Formato de fecha incorrecto. ");
			}
			
			int dia=Integer.parseInt(partes[0]);
			int mes=Integer.parseInt(partes[1]);
			int anho=Integer.parseInt(partes[2]);
			
			if(anho<1000||anho>9999)
			{
				System.out.println("Año inválido");
				continue;//Volver a pedir el año
			}
			if (mes < 1 || mes > 12) {
                System.out.println("Mes inválido. Debe estar entre 1 y 12.");
                continue; // Volver a solicitar la fecha
            }

            int maxDia;
            switch (mes) {
                case 2:
                    if (anho % 4 == 0 && (anho % 100 != 0 || anho % 400 == 0)) {
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
                continue; // Volver a solicitar la fecha
            }

            entradaValida = true;
            System.out.println("La fecha ingresada es válida.");
        }
			
	}
			
}


