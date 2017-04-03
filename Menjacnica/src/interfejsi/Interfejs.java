package interfejsi;

import java.util.GregorianCalendar;

public interface Interfejs {
	public void dodajKurs(GregorianCalendar datum, int prodajni, int srednji, int kupovni, String valuta);
	public void obrisiKurs(GregorianCalendar datum);
	public void pronadjiKurs(GregorianCalendar datum, String valuta);
}
