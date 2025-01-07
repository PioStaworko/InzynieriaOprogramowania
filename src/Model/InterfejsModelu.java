package Model;

import Prezenter.*;

public interface InterfejsModelu {
	boolean WykonajWniosek(Wniosek w);
//	void DodajWniosekDoKolejki(Wniosek w);
	Obywatel ZnajdzObywatela(String pesel);
}