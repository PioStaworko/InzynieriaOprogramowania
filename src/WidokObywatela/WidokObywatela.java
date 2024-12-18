package WidokObywatela;

import Prezenter.*;

import java.util.Scanner;

public class WidokObywatela {

	private String typWidoku;
	private Wniosek wniosek;

	public Wniosek pokaz(Wniosek w) {
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
		else if(w.getClass()==WniosekOwyborWniosku.class){
			System.out.println("Wybierz typ wniosku");
			System.out.println("1. Wniosek o narodziny lub śmierć");
			System.out.println("2. Wniosek o aktualizacje danych");
			System.out.println("3. Wniosek o kopie danych");
			Scanner scanner = new Scanner(System.in);
			int wybor = scanner.nextInt();
			if(wybor == 1){
				w.setkey("typwniosku", "narodzinysmierc");
			}else if(wybor == 2) {
				w.setkey("typwniosku", "aktualizacja");
			}else if(wybor == 3){
				w.setkey("typwniosku", "kopiadanych");
			} else{
				throw new UnsupportedOperationException();
			}
			return w;
		} else if (w.getClass() == WniosekOKopieDanych.class) {
			System.out.println("Wniosek o kopie danych");
			System.out.println("Podaj pesel");
			Scanner scanner = new Scanner(System.in);
			String pesel = scanner.nextLine();
			w.setkey("pesel", pesel);

		}
		return null;
	}

	public void wyslijwniosek() {
		// TODO - implement WidokObywatela.wyslijwniosek
		throw new UnsupportedOperationException();
	}

	public void wybierztypwniosku() {
		// TODO - implement WidokObywatela.wybierztypwniosku
		throw new UnsupportedOperationException();
	}

}