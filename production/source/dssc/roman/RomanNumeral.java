/**
 * @author Andrea Lorenzon
 * @brief A class to manage Roman Numerals
 *                 Bases:
 *                 I(1),
 *                 IV(4),
 *                 V(5),
 *                 IX(9),
 *                 X(10),
 *                 XL(40),
 *                 L(50),
 *                 XC(90),
 *                 X(100),
 *                 CD(400),
 *                 D(500),
 *                 CM(900),
 *                 M(1000)
 *
 */

package dssc.roman;

import java.util.stream.Stream;

public class RomanNumeral {
    @Override
    public String toString() {
        return this.roman;
    }

    // private variables

    private Integer value;
    private String roman = "";

    /**@brief Class for Roman Numeral numbers
     * @param decimal : an int used by the constructor
     */
    public RomanNumeral(int decimal) {
        this.value = decimal;

        roman = "";


        while (value>=1000) {   // M
            roman+="M";
            value-=1000;
        }

        while (value>=900) {    // CM
            roman+="CM";
            value-=900;
        }

        while (value>=500) {    // L
            roman+="D";
            value-=500;
        }

        while (value>=400) {    // CD
            roman+="CD";
            value-=400;
        }
        
        while (value>=100) {    // C
            roman+="C";
            value-=100;
        }

        while (value>=90) {     // XC
            roman+="XC";
            value-=90;
        }

        while (value>=50) {     // L
            roman+="L";
            value-=50;
        }
        while (value>=40) {      // XL
            roman+="IX";
            value-=40;
        }
        while (value>=10) {    // X
            roman+="X";
            value-=10;
        }
        while (value>=9) {      //IX
            roman+="IX";
            value-=9;
        }
        while (value>=5) {      // V
            roman+="V";
            value-=5;
        }
        while (value>=4) {      // IV
            roman+="IV";
            value-=4;
        }
        while (value>=1) {      // I
            roman+="I";
            value-=1;

        }

        /*
        Rinominata a decimal la variabile di input, dobbiamo fare override del metodo toString(), almeno.
        CTRL-O possiamo fare override di un metodo, e mettiamo che ritorni stringa vuota. rifacciamo il test
        ed è verde. Il test passa.
         */

    }
}
