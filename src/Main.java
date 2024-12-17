import Model.*;
import Prezenter.*;
import WidokObywatela.*;
public class Main {
    public static void main(String[] args) {
        FasadaModelu model = new FasadaModelu();
        model.Wyslijwniosekdozatwierdzenia(new WniosekOAktualizacjeDanych());

    }

}