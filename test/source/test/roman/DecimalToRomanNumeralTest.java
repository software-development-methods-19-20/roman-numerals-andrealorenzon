package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DecimalToRomanNumeralTest {
    // step 1. iniziamo scegliendo il test più semplice. Prendiamo lo 0, che dovrebbe restituire "".
    // alt+insert -> Test method -> JUnit 5.
    // compare @Test \n void name() {}
    /*

    @Test
    void name() {

    }

    Usiamo un'asserzione, al suo interno, dopo avergli dato un nome significativo. Scrivendo assertEquals()
    dà missing method, ma cliccando con il mouse si può selezionare import static... e importare
    org.junit.jupiter.api.Assertions.assertEquals;
    Prima dichiaro un oggetto di classe RomanNumeral, che non esiste, e lo costruisco da uno zero.
    toString anche è in rosso.

    Creiamo la classe nel folder production ( lo aggiungiamo a git quando richiesto), con un nome di
    un package diverso (tipo dssc.roman) che non sia quello di test.roman in uso qui.

    Resta solo l'errore sul costruttore. Contextual menu, e create constructor. A questo punto compila.


     */
    /*
    Ora si può runnare il test (già configurato dal prof) "all tests", che fallisce.
    Andiamo a RomanNumeral.java per implementare.
     */

    @Test
    void zeroIsEmptyString() {
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("", romanNumeral.toString());
    }

    @Test
    void number1IsI() {
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I", romanNumeral.toString() );
    }

    @Test
    void number4IsIV() {
        RomanNumeral romanNumeral = new RomanNumeral(4);
        assertEquals("IV", romanNumeral.toString() );
    }

    @Test
    void number10IsX() {
        RomanNumeral romanNumeral = new RomanNumeral(10);
        assertEquals("X", romanNumeral.toString() );
    }

    @Test
    void number2019IsMMXIX() {
        RomanNumeral romanNumeral = new RomanNumeral(2019);
        assertEquals("MMXIX", romanNumeral.toString() );
    }

    @Test
    void number3724IsMMMDCCXXIV() {
        RomanNumeral romanNumeral = new RomanNumeral(3724);
        assertEquals("MMMDCCXXIV", romanNumeral.toString() );
    }

    @Test
    void number3724IsMMMDCCXXIV_double() {
        RomanNumeral romanNumeral = new RomanNumeral(3724);
        assertEquals("MMMDCCXXIV", romanNumeral.toString());
        assertEquals("MMMDCCXXIV", romanNumeral.toString());
    }
}
