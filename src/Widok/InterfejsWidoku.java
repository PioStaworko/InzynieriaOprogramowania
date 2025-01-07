package Widok;


public interface InterfejsWidoku {
    void WyswietlFormularz(Prezenter.Wniosek w);
    void WyswietlObywatela(Model.Obywatel obywatel);
    void WyswietlKomunikat(String komunikat);
    String PobierzDaneZKonsoli(String pytanie);
}
