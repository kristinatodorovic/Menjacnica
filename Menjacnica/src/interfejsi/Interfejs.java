package interfejsi;

import java.util.GregorianCalendar;

import kursevi.Kurs;

public interface Interfejs {
	public void dodajKurs(GregorianCalendar datum, int prodajni, int srednji, int kupovni, String valuta);
	public void obrisiKurs(GregorianCalendar datum, String valuta);
	public Kurs pronadjiKurs(GregorianCalendar datum, String valuta);
}
