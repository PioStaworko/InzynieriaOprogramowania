package Model;

public class AdapterBazyDanych {

	private String DB_URL;
	private String KluczDostepu;
	private String OracleSQLHandle;
	private static AdapterBazyDanych instance;

	/**
	 * 
	 * @param Domain
	 * @param User
	 * @param KluczDostepu
	 */
	public AdapterBazyDanych(String Domain, String User, String KluczDostepu) {
		// TODO - implement AdapterBazyDanych.AdapterBazyDanych
		throw new UnsupportedOperationException();
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
	public void OdczytajObywatela(String PESEL) {
		// TODO - implement AdapterBazyDanych.OdczytajObywatela
		throw new UnsupportedOperationException();
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

}