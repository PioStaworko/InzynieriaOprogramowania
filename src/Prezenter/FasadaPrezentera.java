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
	public Wniosek getWidok(String TypWniosku) {
		throw new UnsupportedOperationException();
	}
	public String getWyborWniosku(){
		return "narodzinysmierc";
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