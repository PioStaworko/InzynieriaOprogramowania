package Prezenter;

public class FabrykaWnioskow {

	/**
	 * 
	 * @param TypWniosku
	 */
	public Wniosek StworzWniosek(String TypWniosku) {
		if (TypWniosku.equals("narodzinysmierc")) {
			WniosekONarodzinyorSmierc wk = new WniosekONarodzinyorSmierc();
			wk.setkey("pesel","");
			wk.setkey("datasmierci","");
			return wk;
		} else {
			throw new UnsupportedOperationException();
		}
	}

}