package Model;

import Prezenter.*;

import java.util.Vector;

public class FasadaModelu implements Dostepdomodelu {
	KolejkaWnioskow kolejka;

	public FasadaModelu() {
		kolejka = new KolejkaWnioskow();
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
		// TODO - implement FasadaModelu.ZatwierdzWniosek
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Wniosek
	 */
	public void Wyslijwniosekdozatwierdzenia(Wniosek Wniosek) {
		// TODO - implement FasadaModelu.Wyslijwniosekdozatwierdzenia
		throw new UnsupportedOperationException();
	}

	public Vector<Wniosek> getwnioskidozatwierdzenia() {
		return kolejka.GetWnioski();

	}

	@Override
	public void WyslijWniosekDoZatwierdzenia(Wniosek Wniosek) {
		kolejka.DodajWniosek(Wniosek);
	}

	public void NowyWniosekObywatela(){
		FasadaPrezentera fs = new FasadaPrezentera();
		String typ_wniosku = fs.getWyborWniosku();
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