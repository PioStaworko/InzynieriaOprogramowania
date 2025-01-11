package Model;

import Prezenter.*;

public interface InterfejsModelu {
//	boolean WykonajWniosek(Wniosek w);
	Obywatel ZnajdzObywatela(String pesel);
	boolean DodajWniosekDoKolejki(Wniosek w);
	boolean WykonajPierwszyWniosekWKolejce();
}