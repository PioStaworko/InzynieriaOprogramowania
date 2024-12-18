package Prezenter;

public class FabrykaWnioskow {

	/**
	 * 
	 * @param TypWniosku
	 */
	public Wniosek StworzWniosek(String TypWniosku) {
		if (TypWniosku.equals("narodzinysmierc")) {
			WniosekONarodzinyorSmierc wk = new WniosekONarodzinyorSmierc();
			wk.setkey("pesel", "");
			wk.setkey("datasmierci", "");
			return wk;
		} else if (TypWniosku.equals("kopiadanych")) {
			WniosekOKopieDanych wk = new WniosekOKopieDanych();
			wk.setkey("pesel", "");
			wk.setkey("dataurodzenia", "");
			wk.setkey("imie", "");
			wk.setkey("nazwisko", "");
			return wk;
		}else if(TypWniosku.equals("aktualizacja")){
			WniosekOAktualizacjeDanych wk = new WniosekOAktualizacjeDanych();
			wk.setkey("pesel", "");
			wk.setkey("dataurodzenia", "");
			wk.setkey("imie", "");
			wk.setkey("nazwisko", "");
			return wk;
		}else if(TypWniosku.equals("wniosekowniosek")){
			WniosekOwyborWniosku wk = new WniosekOwyborWniosku();
			wk.setkey("typwniosku", "");
			return wk;
		}
		return null;
	}
	public WniosekOKopieDanych GetWniosekOKopieDanych() {
		// TODO - implement FabrykaWnioskow.GetWniosekOKopieDanych
		throw new UnsupportedOperationException();
	}

	public WniosekONarodzinyorSmierc GetWniosekONarodzinyorSmierc() {
		// TODO - implement FabrykaWnioskow.GetWniosekONarodzinyorSmierc
		throw new UnsupportedOperationException();
	}

	public WniosekOwyborWniosku GetWniosekOAktualizacjeDancyh() {
		// TODO - implement FabrykaWnioskow.GetWniosekOAktualizacjeDancyh
		throw new UnsupportedOperationException();
	}

	public void GetWniosekOWybor() {
		// TODO - implement FabrykaWnioskow.GetWniosekOWybor
		throw new UnsupportedOperationException();
	}

}