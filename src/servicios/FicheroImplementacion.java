package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz {
	@Override
	public void ficheroLog(String mensaje) {
		try {
			BufferedWriter escribe = new BufferedWriter(new FileWriter(Inicio.rutaCompletaLog, true));

			escribe.write(mensaje.concat("\n"));

			escribe.close();
		} catch (IOException e1) {

			System.out.println("Hubo un error en el fichero log  Error:001");
		}
	}

}