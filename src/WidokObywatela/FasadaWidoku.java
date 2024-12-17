package WidokObywatela;

import Prezenter.*;

import java.util.Scanner;

public class FasadaWidoku  {

	/**
	 * 
	 * @param typWidoku
	 */
	public Wniosek getWidok(Wniosek w) {
		// TODO - implement FasadaWidoku.getWidok
		if (w.getClass() == WniosekONarodzinyorSmierc.class ) {
			System.out.println("Wniosek o narodziny lub śmierć");
			System.out.println("podaj pesel");
			Scanner scanner = new Scanner(System.in);
			String pesel = scanner.nextLine();
			w.setkey("pesel", pesel);
			System.out.println("podaj datę śmierci");
			String datasmierci = scanner.nextLine();
			w.setkey("datasmierci", datasmierci);
			return w;
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param wniosek
	 */
	public boolean wyslijWniosek(Wniosek wniosek) {
		// TODO - implement FasadaWidoku.wyslijWniosek
		throw new UnsupportedOperationException();
	}

}