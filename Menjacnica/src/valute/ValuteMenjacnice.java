package valute;

import java.util.LinkedList;

public class ValuteMenjacnice {
	LinkedList<Valuta> valute=new LinkedList<Valuta>();

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if(valute==null) throw new RuntimeException("Greska!");
		else this.valute = valute;
	}

	@Override
	public String toString() {
		return "ValuteMenjacnice [valute=" + valute + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
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
		ValuteMenjacnice other = (ValuteMenjacnice) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}
	
}
