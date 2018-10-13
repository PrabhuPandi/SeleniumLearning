package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hello {
	
	public static void main(String[] args) {
		//System.out.println(args.length);
		//Date d = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fm = new SimpleDateFormat();
		System.out.println(fm.get2DigitYearStart());
		System.out.println(fm.getCalendar());
		System.out.println(fm.toLocalizedPattern());
//		System.out.println(fm.format(cal.getTime()));	
//		System.out.println(cal.getTimeZone());
//		System.out.println(cal.getCalendarType());
//		System.out.println(cal.getFirstDayOfWeek());
//		System.out.println(cal.getTimeInMillis());
//		System.out.println(cal.getWeeksInWeekYear());
//		System.out.println(cal.getMinimalDaysInFirstWeek());
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
//		System.out.println(cal.getClass());
//		System.out.println(cal.getAvailableLocales());
//		System.out.println(cal.getAvailableCalendarTypes());
		
		//String s1 = System.getProperty("user.dir");
		
		//System.out.println(s1);

		
	}

}
