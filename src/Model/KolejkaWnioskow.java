package Model;

import Prezenter.*;

import java.util.Vector;

public class KolejkaWnioskow {

	private Vector<Wniosek> Wnioski;

	public KolejkaWnioskow() {
		Wnioski = new Vector<Wniosek>();
	}

	public void DodajWniosek(Wniosek Wniosek) {
		Wnioski.add(Wniosek);
	}

	public Vector<Wniosek> GetWnioski() {
		return Wnioski;
	}
}