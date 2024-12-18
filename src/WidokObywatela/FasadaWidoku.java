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
		}else if(w.getClass() == WniosekOAktualizacjeDanych.class){
			System.out.println("Wniosek o aktualizacje danych");
			System.out.println("Podaj nowe imie");
			Scanner scanner = new Scanner(System.in);
			String noweImie = scanner.nextLine();
			w.setkey("imie", noweImie);
			System.out.println("Podaj swoj pesel");
			String pesel = scanner.nextLine();
			w.setkey("pesel", pesel);
			return w;
		}
		return null;
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