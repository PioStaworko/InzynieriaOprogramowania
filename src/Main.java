import Model.*;
import Prezenter.*;
import WidokObywatela.*;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        FasadaModelu fsmodelu = new FasadaModelu();
        FasadaWidoku fswidoku = new FasadaWidoku();
        FasadaPrezentera fsprezentera = new FasadaPrezentera();


        String typ_wniosku = fsprezentera.getWyborWniosku(1);
        Wniosek w  = fsprezentera.getWniosek(typ_wniosku);
        fswidoku.getWidok(w);
        fsmodelu.WyslijWniosekDoZatwierdzenia(w);
        Vector<Wniosek> dozatwierdzenia = fsmodelu.getwnioskidozatwierdzenia();
        for (Wniosek wniosek : dozatwierdzenia) {
            System.out.println(wniosek.toString());
        }
        fsmodelu.WykonajWniosek(w);

        typ_wniosku = fsprezentera.getWyborWniosku(2);
        Wniosek w2 = fsprezentera.getWniosek(typ_wniosku);
        fswidoku.getWidok(w);
        fsmodelu.ZatwierdzWniosek(w2);
        vector<Wniosek> zatwierdzone = fsmodelu.getzatwierdzone();
        for (Wniosek zatwierdzony : zatwierdzone){
            fsmodelu.WykonajWniosek(w2);
        }

    }
}