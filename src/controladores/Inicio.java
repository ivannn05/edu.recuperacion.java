package controladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static final String rutaRaizLogs = "C:\\Users\\csi23-iloposa\\workspace-recuperacion-Java\\logs";
	public static final String nombreLog = "log.txt";
	public static final String rutaCompletaLog = rutaRaizLogs.concat("\\").concat(nombreLog);

	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi= new FicheroImplementacion();
		boolean cerrarMenu = false;
		int opc;
		do {
			try {
				String j=null;
				j.length();
				opc = mi.mostrarMenuYSeleccion();
				switch (opc) {
				case 0:
					System.out.println("Selecciono cerrar menu");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("Selecciono Alta de objeto");
					break;
				default:
					System.out.println("Selecciono una opccion que no existe");
					break;

				}
			} catch (Exception e) {
				fi.ficheroLog(e);

			}
		} while (!cerrarMenu);

	}

	

}
