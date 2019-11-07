/**
 * @author Andrea Lorenzon
 * @brief A class to manage Roman Numerals
 */

package dssc.roman;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class RomanNumeral {
    @Override
    public String toString() {
        return this.roman;
    }

    // private variables

    private String roman = "";

    /**@brief Class for Roman Numeral numbers
     * @param decimal : an int used by the constructor
     */
    public RomanNumeral(int decimal) {
        Integer value = decimal;

        roman = "";

    /** reversed order TreeMap of all the bases of the roman numbers */
    Map<Integer, String> bases =  new TreeMap<Integer, String>(Collections.reverseOrder());
    bases.put(1000, "M");
    bases.put(900,  "CM");
    bases.put(500,  "D");
    bases.put(400,  "CD");
    bases.put(100,  "C");
    bases.put(90,   "XC");
    bases.put(50,   "L");
    bases.put(40,   "XL");
    bases.put(10,   "X");
    bases.put(9,    "IX");
    bases.put(5,    "V");
    bases.put(4,    "IV");
    bases.put(1,    "I");

    /** Actual parsing of value, with progressive subtraction of bases keys and concatenation of letters
     * until value is zero.
     */
    for (Map.Entry<Integer, String> entry : bases.entrySet()) {
        while (value >= entry.getKey()) {
            this.roman += entry.getValue();
            value -= entry.getKey();
        }
    }
    /** value is zero, now. */


    /*
    Rinominata a decimal la variabile di input, dobbiamo fare override del metodo toString(), almeno.
    CTRL-O possiamo fare override di un metodo, e mettiamo che ritorni stringa vuota. rifacciamo il test
    ed è verde. Il test passa.
    */

    }
}
