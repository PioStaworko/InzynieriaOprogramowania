package Prezenter;

public class FasadaPrezentera {

	private String typwniosku;
	private FabrykaWnioskow fabryka_wnioskow;

	public FasadaPrezentera(){
		fabryka_wnioskow = new FabrykaWnioskow();
	}
	/**
	 * 
	 * @param TypWniosku
	 */
	public Wniosek getWidok(int TypWniosku) {
		throw new UnsupportedOperationException();
	}
	public String getWyborWniosku(int wybor){
		switch (wybor){
			case 1:
				return "narodzinysmierc";
			case 2:
				return "aktualizacja";
			case 3:
				return "kopiadanych";
			case 4:
				return "certyfikat";
			default:
				throw new UnsupportedOperationException();
		}
	}
	public Wniosek getWniosek(String typwniosku){
		return fabryka_wnioskow.StworzWniosek(typwniosku);
	}
	/**
	 * 
	 * @param wniosek
	 */
	public boolean WyslijWniosek(Wniosek wniosek) {
		// TODO - implement FasadaPrezentera.WyslijWniosek
		throw new UnsupportedOperationException();
	}

	public Wniosek przekazWniosek(String wniosek) {
		throw new UnsupportedOperationException();
	}

}