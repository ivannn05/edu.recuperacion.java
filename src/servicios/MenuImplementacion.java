package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc= new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		int opc;
		System.out.println("################################################");
		System.out.println("Seleccione una opcion");
		System.out.println("0.Cerrar menu");
		System.out.println("1.Alta de objeto");
		System.out.println("################################################");
		opc=sc.nextInt();
		return opc;
	}

}
