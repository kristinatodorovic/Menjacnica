import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.Interfejs;
import kursevi.Kurs;
import valute.Valuta;
import valute.ValuteMenjacnice;

public class Implementacija implements Interfejs {

	ValuteMenjacnice menjacnica=new ValuteMenjacnice();
	
	@Override
	public void dodajKurs(GregorianCalendar datum, int prodajni, int srednji, int kupovni, String valuta) {
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				Kurs k=new Kurs();
				k.setDatum(datum);
				k.setKupovni(kupovni);
				k.setProdajni(prodajni);
				k.setSrednji(srednji);
				menjacnica.getValute().get(i).getKursevi().add(k);
				return;
			}
		}
		

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String valuta) {
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				for(int j=0;j<menjacnica.getValute().get(i).getKursevi().size();j++){
					if(menjacnica.getValute().get(i).getKursevi().get(j).getDatum().equals(datum)) {
						menjacnica.getValute().get(i).getKursevi().remove(j);
						return;
					}
						
				}
			}
		}

	}

	@Override
	public Kurs pronadjiKurs(GregorianCalendar datum, String valuta) {
	Kurs k=new Kurs();
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				for(int j=0;j<menjacnica.getValute().get(i).getKursevi().size();j++){
					if(menjacnica.getValute().get(i).getKursevi().get(j).getDatum().equals(datum)){
						k.setDatum(datum);
						k.setKupovni(menjacnica.getValute().get(i).getKursevi().get(j).getKupovni());
						k.setProdajni(menjacnica.getValute().get(i).getKursevi().get(j).getProdajni());
						k.setSrednji(menjacnica.getValute().get(i).getKursevi().get(j).getSrednji());
							}
					}
			}
	}
		return k;

}
	
}
