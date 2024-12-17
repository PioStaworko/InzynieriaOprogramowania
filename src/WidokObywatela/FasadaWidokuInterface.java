package WidokObywatela;

import Prezenter.*;

public interface FasadaWidokuInterface {

	/**
	 * 
	 * @param typWidoku
	 */
	Wniosek getWidok(String typWidoku);

	/**
	 * 
	 * @param wniosek
	 */
	boolean wyslijWniosek(Wniosek wniosek);

}