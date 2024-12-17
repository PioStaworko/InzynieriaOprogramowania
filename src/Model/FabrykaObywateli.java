package Model;

public class FabrykaObywateli {

	/**
	 * 
	 * @param Pesel
	 */
	public Obywatel ZnajdzObywatela(String Pesel) {
		AdapterBazyDanych abd = new AdapterBazyDanych();
		Obywatel obw = abd.OdczytajObywatela(Pesel);
		return obw;
	}

	public void StworzNowegoObywatela() {
		// TODO - implement FabrykaObywateli.StworzNowegoObywatela
		throw new UnsupportedOperationException();
	}

}