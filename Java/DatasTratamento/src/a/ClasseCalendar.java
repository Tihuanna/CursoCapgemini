package a;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		// Recupera��o da data com a classe calendar
		
		System.out.println("=> Recupera��o da data");
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Data e hora atual: "+ cal.getTime()+ "\n");
		
		System.out.println("Ano: "+cal.get(Calendar.YEAR));
		
		System.out.println("Dia do m�s: " +cal.get(Calendar.DAY_OF_MONTH)+"\n");
		
		System.out.println("Alterando data e hora com o m�todo set \n" );
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.DAY_OF_MONTH, 2);
		System.out.println("Data/Hora atual: "+ cal.getTime());
		System.out.println("Ano: "+ cal.get(Calendar.YEAR));
		System.out.println("Dia do m�s: "+ cal.get(Calendar.DAY_OF_MONTH)+ "\n");
	
		
		
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Agora s�o: "+ hora+" hrs");
		
		if(hora > 6 && hora <12) {
			System.out.println("Bom dia");
		} else if(hora > 12 && hora <18) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite ");
		}
	
	}

}
