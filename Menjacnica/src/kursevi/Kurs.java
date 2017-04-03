package kursevi;

import java.util.GregorianCalendar;

public class Kurs {
	
	GregorianCalendar datum;
	int prodajni;
	int srednji;
	int kupovni;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public int getProdajni() {
		return prodajni;
	}
	public void setProdajni(int prodajni) {
		this.prodajni = prodajni;
	}
	public int getSrednji() {
		return srednji;
	}
	public void setSrednji(int srednji) {
		this.srednji = srednji;
	}
	public int getKupovni() {
		return kupovni;
	}
	public void setKupovni(int kupovni) {
		this.kupovni = kupovni;
	}
	@Override
	public String toString() {
		return "Kurs [prodajni=" + prodajni + ", srednji=" + srednji + ", kupovni=" + kupovni + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + kupovni;
		result = prime * result + prodajni;
		result = prime * result + srednji;
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kupovni != other.kupovni)
			return false;
		if (prodajni != other.prodajni)
			return false;
		if (srednji != other.srednji)
			return false;
		return true;
	}


	
	
}
