package Model;

import Prezenter.Wniosek;
import Prezenter.WniosekOAktualizacjeDanych;
import Prezenter.WniosekOSmierc;


public class Model implements InterfejsModelu {
    @Override
    public boolean WykonajWniosek(Wniosek w) {
        if (w instanceof WniosekOSmierc) {
            Obywatel obw = ZnajdzObywatela(w.getkey("pesel"));
            if (obw != null) {
                obw.setData_Smierci(w.getkey("datasmierci"));
                return true;
            }
            else{
                return false;
            }
        } else if (w instanceof WniosekOAktualizacjeDanych) {
            Obywatel obw = ZnajdzObywatela(w.getkey("pesel"));
            if (obw != null) {
                obw.setImie(w.getkey("imie"));
                obw.setNazwisko(w.getkey("nazwisko"));
                obw.setData_urodzenia(w.getkey("dataurodzenia"));
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }


    /**
     * @param pesel pesel obywatela ktorego szukamy
     * @return Obywatel
     */
    @Override
    public Obywatel ZnajdzObywatela(String pesel) {
        FabrykaObywateli fo = new FabrykaObywateli();
        return fo.ZnajdzObywatela(pesel);
    }
}
