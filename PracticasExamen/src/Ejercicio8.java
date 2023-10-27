import java.util.Scanner;

public class Ejercicio8 {
	
	
	
	public static void main(String[] args) {
		PedirPrecio();
		MostrarPrecio();

	}

	private static void MostrarPrecio() {
		// TODO Auto-generated method stub
		
	}

	private static void PedirPrecio() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un precio");
		String sPrecio=sc.nextLine();
		
		String[] Precio=sPrecio.split(",");
		int Euro=Integer.parseInt(Precio[0]);
		int Monedas=Integer.parseInt(Precio[1]);
		
		
	}

}
