package Prezenter;

import Model.InterfejsModelu;
import Model.Obywatel;
import Widok.InterfejsWidoku;

public class Prezenter {
    private final FabrykaWnioskow fabrykaWnioskow;
    private final InterfejsModelu model;
    private final InterfejsWidoku widok;

    public Prezenter(InterfejsWidoku widok, InterfejsModelu model) {
        fabrykaWnioskow = new FabrykaWnioskow();
        this.model = model;
        this.widok = widok;
    }

    public TypWniosku DajObywatelowiWyborWniosku() {
        widok.WyswietlKomunikat("Wybierz typ wniosku: ");
        widok.WyswietlKomunikat("1. Aktualizacja danych");
        widok.WyswietlKomunikat("2. Śmierć Obywatela");
        widok.WyswietlKomunikat("3. Kopia danych");
        int wybor = -1;
        while (wybor < 1 || wybor > 3) {
            wybor = Integer.parseInt(widok.PobierzDaneZKonsoli("Wybierz numer wniosku: "));
            if (wybor < 1 || wybor > 3) {
                widok.WyswietlKomunikat("Nie ma takiego numeru wniosku. Wybierz ponownie.");
            }
        }
        return switch (wybor) {
            case 1 -> TypWniosku.AKTUALIZACJA_DANCYH;
            case 2 -> TypWniosku.ZGON;
            case 3 -> TypWniosku.KOPIA_DANYCH;
            default -> throw new UnsupportedOperationException();
        };
    }


    public boolean WykonajWniosekObywatela() {
        TypWniosku typwniosku = DajObywatelowiWyborWniosku();
        Wniosek wniosek = fabrykaWnioskow.StworzWniosek(typwniosku);
        widok.WyswietlFormularz(wniosek);
        switch (typwniosku) {
            case KOPIA_DANYCH -> {
                Obywatel znobyw = model.ZnajdzObywatela(wniosek.getkey("pesel"));
                if (znobyw == null) {
                    widok.WyswietlKomunikat("Nie znaleziono obywatela o podanym peselu.");
                    return false;
                }
                widok.WyswietlObywatela(znobyw);
            }
            case ZGON -> {
                if (model.WykonajWniosek(wniosek)) {
                    widok.WyswietlKomunikat("Poprawnie zabito obywatela.");
                } else {
                    widok.WyswietlKomunikat("Błąd obywatel nieodnaleziony");
                }
            }
            case AKTUALIZACJA_DANCYH -> {
                if (model.WykonajWniosek(wniosek)) {
                    widok.WyswietlKomunikat("Poprawnie zaktualizowano dane obywatela.");
                } else {
                    widok.WyswietlKomunikat("Błąd obywatel nieodnaleziony");
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prezenter p = new Prezenter(new Widok.WidokObywatela(), new Model.Model());
        while (true) {
            if (!p.WykonajWniosekObywatela()) {
                break;
            }
        }
    }
}
