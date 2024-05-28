package utilidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String creacionNombreFichero() {
		
		String fecha;
		///Para poner un formato a una fecha con DateTime
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyy");
		LocalDate fechaActual = LocalDate.now();
		fecha=fechaActual.format(formato);
		return fecha;
	}
}
