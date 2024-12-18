package Model;

import Prezenter.*;

import java.util.Vector;

public class FasadaModelu implements Dostepdomodelu {
	KolejkaWnioskow kolejka;
	KolejkaWnioskow zatwierdzone;

	public FasadaModelu() {
		kolejka = new KolejkaWnioskow();
		zatwierdzone = new KolejkaWnioskow();
	}
	public Wniosek[] GetWnioskiDoZatwierdzenia() {
		// TODO - implement FasadaModelu.GetWnioskiDoZatwierdzenia
		throw new UnsupportedOperationException();
	}

	@Override
	public Wniosek GetWnioskiToAprove() {
		return null;
	}

	/**
	 * 
	 * @param wniosek
	 */
	public void ZatwierdzWniosek(Wniosek wniosek) {
		zatwierdzone.DodajWniosek(wniosek);
	}

	/**
	 * 
	 * @param Wniosek
	 */
	public void Wyslijwniosekdozatwierdzenia(Wniosek Wniosek) {
		// TODO - implement FasadaModelu.Wyslijwniosekdozatwierdzenia
		throw new UnsupportedOperationException();
	}

	public void WykonajWniosek(Wniosek wniosek) {
		if (wniosek.getClass() == WniosekONarodzinyorSmierc.class){
			AdapterBazyDanych adapter = new AdapterBazyDanych();
			Obywatel obw = adapter.OdczytajObywatela(wniosek.getkey("pesel"));
			obw.setData_Smierci(wniosek.getkey("datasmierci"));
			System.out.println("Zmieniono dane obywatela");
			System.out.println("Pesel: " + obw.getPesel());
			System.out.println("Imie: " + obw.getImie());
			System.out.println("Nazwisko: " + obw.getNazwisko());
			System.out.println("Data śmierci: " + obw.getData_Smierci());
		}
		else if(wniosek.getClass() == WniosekOAktualizacjeDanych.class){
			AdapterBazyDanych adapter = new AdapterBazyDanych();
			Obywatel obw = adapter.OdczytajObywatela(wniosek.getkey("pesel"));
			obw.setImie(wniosek.getkey("imie"));
			System.out.println("Zmieniono dane obywatela");
			System.out.println("Imie: " + obw.getImie());
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
	public Vector<Wniosek> getwnioskidozatwierdzenia() {
		return kolejka.GetWnioski();

	}

	public Vector<Wniosek> getzatwierdzone(){
		return zatwierdzone.GetWnioski();
	}

	@Override
	public void WyslijWniosekDoZatwierdzenia(Wniosek Wniosek) {
		kolejka.DodajWniosek(Wniosek);
	}

	public void NowyWniosekObywatela(){
		FasadaPrezentera fs = new FasadaPrezentera();
		String typ_wniosku = fs.getWyborWniosku(1);
		fs.przekazWniosek(typ_wniosku);

	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		for (Wniosek wniosek : kolejka.GetWnioski()) {
			sb.append(wniosek.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}