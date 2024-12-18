import Model.*;
import Prezenter.*;
import WidokObywatela.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        FasadaModelu fsmodelu = new FasadaModelu();
        FasadaWidoku fswidoku = new FasadaWidoku();
        FasadaPrezentera fsprezentera = new FasadaPrezentera();

        while (true){
            Wniosek wyborwniosku = fsprezentera.getWniosek("wniosekowniosek");
            fswidoku.getWidok(wyborwniosku);

            String typ_wniosku = wyborwniosku.getkey("typwniosku");
            Wniosek w  = fsprezentera.getWniosek(typ_wniosku);
            fswidoku.getWidok(w);
            fsmodelu.WyslijWniosekDoZatwierdzenia(w);
            fsmodelu.WykonajWniosek(w);
        }

    }
}