import java.util.GregorianCalendar;

import interfejsi.Interfejs;
import kursevi.Kurs;
import valute.ValuteMenjacnice;

public class Implementacija implements Interfejs {
	ValuteMenjacnice menjacnica=new ValuteMenjacnice();
	@Override
	public void dodajKurs(GregorianCalendar datum, int prodajni, int srednji, int kupovni, String valuta) {
		Kurs ks=new Kurs();
		ks.setDatum(datum);
		ks.setKupovni(kupovni);
		ks.setProdajni(prodajni);
		ks.setSrednji(srednji);
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				menjacnica.getValute().get(i).getKursevi().add(ks);
				return;
			}
		}

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum, String valuta) {
		
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				for(int z=0;z<menjacnica.getValute().get(i).getKursevi().size();z++){
					if(menjacnica.getValute().get(i).getKursevi().get(z).getDatum().equals(datum) && datum!=null){
						menjacnica.getValute().get(i).getKursevi().remove(z);
					}
				}
				}
			}
	}

	@Override
	public Kurs pronadjiKurs(GregorianCalendar datum, String valuta) {
		Kurs ks=new Kurs();
		ks.setDatum(datum);
		for(int i=0;i<menjacnica.getValute().size();i++){
			if(menjacnica.getValute().get(i).getNazivValute().equals(valuta)){
				for(int z=0;z<menjacnica.getValute().get(i).getKursevi().size();z++){
					if(menjacnica.getValute().get(i).getKursevi().get(z).getDatum().equals(datum) && datum!=null){
						ks.setKupovni(menjacnica.getValute().get(i).getKursevi().get(z).getKupovni());
						ks.setKupovni(menjacnica.getValute().get(i).getKursevi().get(z).getSrednji());
						ks.setKupovni(menjacnica.getValute().get(i).getKursevi().get(z).getProdajni());
						
					}
				}
			}
		}
		return ks;
	}
	
}
