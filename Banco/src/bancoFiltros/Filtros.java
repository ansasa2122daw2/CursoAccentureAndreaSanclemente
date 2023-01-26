package bancoFiltros;

import java.time.LocalDate;

/**
 * Clase para filtros, strings mayor que 20 y menor que 30
 * fecha mayor que 3 años y menor que 5
 * ingresos o gastos mayor que 10 menor que 100
 * 
 * Mejor que no sean static
 * @author andrea.sanclemente
 *
 */

public class Filtros {
	private static int MAXFECHA = 3;
	private static int MINFECHA = 5;
	
	public static boolean filtroString(String texto, int maxLong, int minLong) {
		return (texto.length()<= maxLong) && (texto.length()>= minLong);
	}
	public static boolean filtroFecha(LocalDate fecha, LocalDate fMax, LocalDate fMin) {
		LocalDate hoy = LocalDate.now();
		if(fecha.compareTo(fMax) == MAXFECHA) {
			return false;
		}
		if(fecha.compareTo(fMin) == MINFECHA) {
			return false;
		}
//		if(fecha.plusYears(MAXFECHA) != fMax.getYear()) {
//			return true;
//		}
//		if (fecha.minusYears(MAXFECHA) != null) {
//			return true;
//		}
	return true;
	}
	
	public static boolean filtroDinero(double din, int maxLong, int minLong) {
		return (din <= maxLong && din >= minLong);
		
	}

}