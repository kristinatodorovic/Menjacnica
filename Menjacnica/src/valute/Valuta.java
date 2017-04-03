package valute;

import java.util.LinkedList;

import kursevi.Kurs;

public class Valuta {
	String nazivValute;
	String skrNaziv;
	LinkedList<Kurs> kursevi=new LinkedList<Kurs>();
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute==null || nazivValute.equals("")) throw new RuntimeException("Naziv valute ne moze biti null ili prazan string.");
		else this.nazivValute = nazivValute;
	}
	public String getSkrNaziv() {
		return skrNaziv;
	}
	public void setSkrNaziv(String skrNaziv) {
		if(skrNaziv.length()>3 || skrNaziv==null) throw new RuntimeException("Skr. valute ne moze biti null ili duza od tri slova");
		else this.skrNaziv = skrNaziv;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	@Override
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", skrNaziv=" + skrNaziv + ", kursevi=" + kursevi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result + ((skrNaziv == null) ? 0 : skrNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (skrNaziv == null) {
			if (other.skrNaziv != null)
				return false;
		} else if (!skrNaziv.equals(other.skrNaziv))
			return false;
		return true;
	}
	
	
}
