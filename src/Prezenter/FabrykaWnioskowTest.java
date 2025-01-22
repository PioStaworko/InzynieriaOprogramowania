package Prezenter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class FabrykaWnioskowTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void stworzWniosekOZgon(){
        FabrykaWnioskow fb = new FabrykaWnioskow();
        Wniosek wniosek = fb.StworzWniosek(TypWniosku.ZGON);
        assertEquals(WniosekOSmierc.class, wniosek.getClass());
        String[] klucze = {
                "pesel",
                "datasmierci"
        };
        assertEquals(klucze.length, wniosek.getkeys().length);
        String[] kluczeWniosku = wniosek.getkeys();
        for (String s : klucze) {
            assertTrue(Arrays.asList(kluczeWniosku).contains(s));
            assertEquals("", wniosek.getkey(s));
        }
    }

    @Test
    void stworzWniosekoAktualizacjeDancyh() {
        FabrykaWnioskow fb = new FabrykaWnioskow();
        Wniosek wniosek = fb.StworzWniosek(TypWniosku.AKTUALIZACJA_DANCYH);
        assertEquals(WniosekOAktualizacjeDanych.class, wniosek.getClass());
        String[] klucze = {
                "pesel",
                "dataurodzenia",
                "imie",
                "nazwisko"
        };
        assertEquals(klucze.length, wniosek.getkeys().length);
        String[] kluczeWniosku = wniosek.getkeys();
        for (String s : klucze) {
            assertTrue(Arrays.asList(kluczeWniosku).contains(s));
            assertEquals("", wniosek.getkey(s));
        }
    }

    @Test
    void stworzWniosekoKopieDancyh(){
        FabrykaWnioskow fb = new FabrykaWnioskow();
        Wniosek wniosek = fb.StworzWniosek(TypWniosku.KOPIA_DANYCH);
        assertEquals(WniosekOKopieDanych.class, wniosek.getClass());
        String[] klucze = {
                "pesel"
        };
        assertEquals(klucze.length, wniosek.getkeys().length);
        String[] kluczeWniosku = wniosek.getkeys();
        for (String s : klucze) {
            assertTrue(Arrays.asList(kluczeWniosku).contains(s));
            assertEquals("", wniosek.getkey(s));
        }
    }

    @Test
    void stworzwniosekPrzekazanoNull(){
        FabrykaWnioskow fb = new FabrykaWnioskow();
        Wniosek wniosek = fb.StworzWniosek(null);
        assertNull(wniosek);
    }
}