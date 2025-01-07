package Prezenter;

public class FabrykaWnioskow {

	/**
	 * 
	 * @param TypWniosku jaki wniosek chcemy stworzyc
	 */
	public Wniosek StworzWniosek(TypWniosku TypWniosku) {
		switch (TypWniosku){
			case AKTUALIZACJA_DANCYH:{
				WniosekOAktualizacjeDanych wk = new WniosekOAktualizacjeDanych();
				wk.setkey("pesel", "");
				wk.setkey("dataurodzenia", "");
				wk.setkey("imie", "");
				wk.setkey("nazwisko", "");
				return wk;
			}
			case KOPIA_DANYCH:
			{
				WniosekOKopieDanych wk = new WniosekOKopieDanych();
				wk.setkey("pesel", "");
				return wk;
			}
			case NARODZINY:{
				throw new UnsupportedOperationException();
			}
			case ZGON:{
				WniosekOSmierc wk = new WniosekOSmierc();
				wk.setkey("pesel", "");
				wk.setkey("datasmierci", "");
				return wk;
			}
			default:
				throw new UnsupportedOperationException();
		}
	}
}