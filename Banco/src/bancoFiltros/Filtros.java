package bancoFiltros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

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
	
	/**
	 * Comprueba si el formato de entrada de fecha es correcto
	 * Se puede indicar el formato, o asumira "dd-MM-yyyy"
	 * @param fecha
	 * @param formato opcional
	 * @return LocalDate con la fecha, si es correcto o null
	 */
	//Primera solución realizada 26/1
	public static LocalDate fechaCorrecta(String fecha) throws Exception {

		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formate2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		if(fecha.contains("/")) {
			System.out.println("FUNCIONA CON /");
			LocalDate dateTime2 = LocalDate.parse(fecha, formate2);
			return dateTime2;
		}
		
		try {
			LocalDate dateTime = LocalDate.parse(fecha, formate);
			System.out.println("FUNCIONA CON -");
			return dateTime;
		}catch(DateTimeParseException e) {
			System.out.println("NULL");
			return null;
		}
	}
	
	//Segunda solución realizada 27/1
	/**
	 * Clase fechaCorrecta que pasa fecha y llamamos al método donde puedes pasarle el formato
	 * @param fecha
	 * @return
	 */
	public static LocalDate fechaCorrecta1(String fecha1) {
		return fechaCorrecta1(fecha1, "dd-MM-yyyy");
	}
	
	public static LocalDate fechaCorrecta1(String fecha1, String format1) {
		DateTimeFormatter formate1 = DateTimeFormatter.ofPattern(format1);
		
		try {
			LocalDate dateTime1 = LocalDate.parse(fecha1, formate1);
			return dateTime1;
		}catch(DateTimeParseException e) {
		}
		return null;
		
	}
	
	
	
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

	return true;
	}
	
	public static boolean filtroDinero(double din, int maxLong, int minLong) {
		return (din <= maxLong && din >= minLong);
		
	}

}
