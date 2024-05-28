package controladores;

import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import utilidades.Util;

public class Inicio {

	

	public static final String rutaCompletaLog = "C:\\Users\\csi23-iloposa\\workspace-recuperacion-Java\\logs".concat("\\").concat("log-").concat(Util.creacionNombreFichero()).concat(".txt");

	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi= new FicheroImplementacion();
		boolean cerrarMenu = false;
		int opc;
		do {
			try {
				//String j=null;
				//j.length();
				opc = mi.mostrarMenuYSeleccion();
				switch (opc) {
				case 0:
					System.out.println("Selecciono cerrar menu");
					fi.ficheroLog("Selecciono cerrar menu");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("Selecciono Alta de objeto");
					fi.ficheroLog("Selecciono Alta de objeto");
					break;
				default:
					System.out.println("Selecciono una opccion que no existe");
					fi.ficheroLog("Selecciono una opccion que no existe");
					break;

				}
			} catch (Exception e) {
				fi.ficheroLog(e.getMessage());

			}
		} while (!cerrarMenu);

	}

	

}
