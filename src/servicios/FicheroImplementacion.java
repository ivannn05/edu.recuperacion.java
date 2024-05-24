package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz {
	@Override
	public  void ficheroLog(Exception e) {
		try {
			BufferedWriter escribe = new BufferedWriter(new FileWriter(Inicio.rutaCompletaLog, true));

			escribe.write(e.getMessage());

			escribe.close();
		} catch (IOException e1) {

			System.out.println(e);
		}
	}
}
