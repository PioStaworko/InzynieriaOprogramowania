import Model.*;
import Prezenter.*;
import WidokObywatela.*;
public class Main {
    public static void main(String[] args) {
        FasadaModelu fsmodelu = new FasadaModelu();
        FasadaWidoku fswidoku = new FasadaWidoku();
        FasadaPrezentera fsprezentera = new FasadaPrezentera();


        String typ_wniosku = fsprezentera.getWyborWniosku();
        Wniosek w  = fsprezentera.getWniosek(typ_wniosku);
        fswidoku.getWidok(w);
        fsmodelu.WyslijWniosekDoZatwierdzenia(w);

        fsmodelu.getwnioskidozatwierdzenia();

        System.out.println("Wniosek został wysłany do zatwierdzenia");
        System.out.println(fsmodelu.getwnioskidozatwierdzenia());


    }

}