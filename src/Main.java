import Model.*;
import Prezenter.*;
import WidokObywatela.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        FasadaModelu fsmodelu = new FasadaModelu();
        FasadaWidoku fswidoku = new FasadaWidoku();
        FasadaPrezentera fsprezentera = new FasadaPrezentera();


        String typ_wniosku = fsprezentera.getWyborWniosku();
        Wniosek w  = fsprezentera.getWniosek(typ_wniosku);
        fswidoku.getWidok(w);
        fsmodelu.WyslijWniosekDoZatwierdzenia(w);
        Vector<Wniosek> dozatwierdzenia = fsmodelu.getwnioskidozatwierdzenia();
        for (Wniosek wniosek : dozatwierdzenia) {
            System.out.println(wniosek.toString());
        }
        fsmodelu.WykonajWniosek(w);

    }
}