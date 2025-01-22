package Model;

import Prezenter.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private Model model;
    private FabrykaObywateli fabrykaObywateli;

    @BeforeEach
    void setUp() {
        model = new Model();
        fabrykaObywateli = new FabrykaObywateli();
    }

    @Test
    void testZnajdzObywatelaIstnieje() {
        Obywatel znaleziony = model.ZnajdzObywatela("1");
        assertNotNull(znaleziony );
        assertEquals("Pawel", znaleziony.getImie());
        assertEquals("Kowalski", znaleziony.getNazwisko());
    }

    @Test
    void testZnajdzObywatelaNieIstnieje() {
        Obywatel znaleziony = model.ZnajdzObywatela("15");
        assertNull(znaleziony );
    }

    @Test
    void testDodajWniosekDoKolejki() {
        Wniosek wniosek = new WniosekOSmierc();
        wniosek.setkey("pesel", "1");
        wniosek.setkey("datasmierci", "2025-01-01");

        boolean dodano = model.DodajWniosekDoKolejki(wniosek);
        assertTrue(dodano);
    }

    @Test
    void testWykonajPierwszyWniosekWKolejceWniosekOSmierc() {
        Wniosek wniosek = new WniosekOSmierc();
        wniosek.setkey("pesel", "1");
        wniosek.setkey("datasmierci", "2025-01-01");
        model.DodajWniosekDoKolejki(wniosek);

        boolean wykonano = model.WykonajPierwszyWniosekWKolejce();
        assertTrue(wykonano);

        Obywatel aktualizowany = model.ZnajdzObywatela("1");
        assertEquals("2025-01-01", aktualizowany.getData_Smierci());
    }

    @Test
    void testWykonajPierwszyWniosekWKolejceAktualizacjeDanych() {
        Wniosek wniosek = new WniosekOAktualizacjeDanych();
        wniosek.setkey("pesel", "1");
        wniosek.setkey("imie", "Adam");
        wniosek.setkey("nazwisko", "Nowak");
        wniosek.setkey("dataurodzenia", "1990-05-15");
        model.DodajWniosekDoKolejki(wniosek);

        boolean wykonano = model.WykonajPierwszyWniosekWKolejce();
        assertTrue(wykonano);

        Obywatel aktualizowany = model.ZnajdzObywatela("1");
        assertEquals("Adam", aktualizowany.getImie());
        assertEquals("Nowak", aktualizowany.getNazwisko());
        assertEquals("1990-05-15", aktualizowany.getData_urodzenia());
    }

    @Test
    void testWykonajPierwszyWniosekWKolejcePustaKolejka() {
        boolean wykonano = model.WykonajPierwszyWniosekWKolejce();
        assertFalse(wykonano);
    }
}
