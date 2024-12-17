package Model;

import Prezenter.*;
import Model.*;

public class FasadaModelu implements Dostepdomodelu {

	public Wniosek[] GetWnioskiDoZatwierdzenia() {
		// TODO - implement FasadaModelu.GetWnioskiDoZatwierdzenia
		throw new UnsupportedOperationException();
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
		System.out.println("Wysłano wniosek do zatwierdzenia");
		throw new UnsupportedOperationException();
	}

	public Wniosek getwnioskidozatwierdzenia() {
		// TODO - implement FasadaModelu.getwnioskidozatwierdzenia
		throw new UnsupportedOperationException();
	}

	@Override
	public void WyslijWniosekDoZatwierdzenia(Wniosek Wniosek) {

	}

	@Override
	public Wniosek GetWnioskiToAprove() {
		return null;
	}
}