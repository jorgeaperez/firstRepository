package ProjectEuler;

import java.util.Calendar;

public class PE19 {
	

	public static void main(String args[]) {
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(1901, 0, 1);
		
		int diaDeInicio = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(diaDeInicio);
		if (diaDeInicio != Calendar.SUNDAY) {
			int numeroDeDiasAgregar = Calendar.DAY_OF_WEEK - diaDeInicio	+ Calendar.SUNDAY;
			c.add(Calendar.DAY_OF_MONTH, numeroDeDiasAgregar);
		}
		

		Calendar calendarioFinal = Calendar.getInstance();
		calendarioFinal.set(2000, 11, 31);
		int numberOfSundays =0;
		while (calendarioFinal.getTimeInMillis() > c.getTimeInMillis()) {
		
			if (isFirstDayOfMonth(c) && isSunday(c)) {
				System.out.println(c.getTime());
				numberOfSundays++;
			}
			c.add(Calendar.DAY_OF_MONTH, Calendar.DAY_OF_WEEK);
		}
		System.out.println("Total!"+ numberOfSundays);
		
		
	}
	private static boolean isSunday(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	private static boolean isFirstDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH) == 1;
	}
}
