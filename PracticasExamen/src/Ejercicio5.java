import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		LetrasDelReves();

	}

	private static void LetrasDelReves() {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce una frase: ");
	        String sFrase = sc.nextLine();
	        String sFraseInvertida = "";

	        for (int i = sFrase.length() - 1; i >= 0; i--) {
	            sFraseInvertida += sFrase.charAt(i);
	        }
	        System.out.println("Frase invertida: " + sFraseInvertida);
	    }
		
	}

