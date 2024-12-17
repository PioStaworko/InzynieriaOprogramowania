package Model;

import Prezenter.*;

public interface Dostepdomodelu {

	/**
	 * 
	 * @param Wniosek
	 */
	void WyslijWniosekDoZatwierdzenia(Wniosek Wniosek);

	Wniosek GetWnioskiToAprove();

}