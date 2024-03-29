package day2.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestDate {
	public static void main(String[] args) {
		 LocalDateTime current1 = LocalDateTime.now();
	        System.out.println("Current Date and Time is: " + current1);	
/*	        
	        LocalDateTime current = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	        String formatted = current.format(formatter);
	        System.out.println("Current Date and Time is: " + formatted); */
	        
	        LocalDateTime current = LocalDateTime.now();

	        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
	        String formatted = current.format(formatter);

	        System.out.println("Current Date is: " + formatted);
	        
	        
//-------------------Add two dates
	        Calendar c1 = Calendar.getInstance();
	        Calendar c2 = Calendar.getInstance();
	        Calendar cTotal = (Calendar) c1.clone();

	        cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
	        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
	        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
	        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
	        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
	        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
	        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));

	        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
	        
}}
