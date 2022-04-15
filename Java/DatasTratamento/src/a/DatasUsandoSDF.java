package a;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DatasUsandoSDF {

	public static void main(String[] args) throws ParseException {
		// usando o Simple Date Format
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date x1 = new Date(15/04/2022);
		Date x2 = new Date (System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L *60L *5L);
		Date y1 =(Date) sdf1.parse("15/04/2022");
		Date y2 =(Date) sdf2.parse("15/04/2022 14:32:55");
		Date y3 = (Date) Date.from(Instant.parse("2022-04-12T16:32:55Z"));
		
		System.out.println("x1" + x1);
		System.out.println("x2" + x2);
		System.out.println("x3" + x3);
		System.out.println("x4" + x4);
		System.out.println("y1" + y1);
		System.out.println("y2" + y2);
		System.out.println("y3" + y3);
		
	}

}
