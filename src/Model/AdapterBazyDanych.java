package Model;

import java.util.Vector;

public class AdapterBazyDanych {

	private String DB_URL;
	private String KluczDostepu;
	private String OracleSQLHandle;
	private static AdapterBazyDanych instance;
	private Vector<Obywatel> obywatele;


	public AdapterBazyDanych() {
		obywatele = new Vector<Obywatel>();
		obywatele.add(new Obywatel("Pawel", "Kowalski","1"));
		obywatele.add(new Obywatel("Wanda", "Wandowska","2"));
		obywatele.add(new Obywatel("Kuba", "Kubowski","123"));

	}

	/**
	 * 
	 * @param instance_obywatel
	 */
	public void DodajObywatela(Obywatel instance_obywatel) {
		// TODO - implement AdapterBazyDanych.DodajObywatela
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 */
	public void UsunObywatel(String PESEL) {
		// TODO - implement AdapterBazyDanych.UsunObywatel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 * @param ObywatelZmodyfikowany
	 */
	public void ModyfikujObywatela(String PESEL, Obywatel ObywatelZmodyfikowany) {
		// TODO - implement AdapterBazyDanych.ModyfikujObywatela
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 */
	public Obywatel OdczytajObywatela(String PESEL) {
		for (Obywatel ob : obywatele) {
			if (ob.getPesel().equals(PESEL)) {
				return ob;
			}
		}
		return null;
	}

	public void getAttribute() {
		// TODO - implement AdapterBazyDanych.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement AdapterBazyDanych.setAttribute
		throw new UnsupportedOperationException();
	}

	public static AdapterBazyDanych getBazaDanych() {
		// TODO - implement AdapterBazyDanych.getBazaDanych
		throw new UnsupportedOperationException();
	}
	public void StworzKopieDanych() {
		// TODO - implement AdapterBazyDanych.StworzKopieDanych
		throw new UnsupportedOperationException();
	}
	public void StworzKopieCertyfikatuNarodzinSmierci () {
		// TODO - implement AdapterBazyDanych. StworzKopieCertyfikatuNarodzinSmierci
		throw new UnsupportedOperationException();
	}


}