package dssc.roman;

public class RomanNumeral {
    @Override
    public String toString() {
        return this.roman;
    }

    // internal variables

    Integer value;
    String roman = "";

    public RomanNumeral(int decimal) {
        value = decimal;

        if (value==0) {
            roman = "";
        }

        else
        {
            switch (value) {
                case 1: {roman = "I";}
                    break;
                case 4: {roman = "IV";}
                    break;
            };
        }

        /*
        Rinominata a decimal la variabile di input, dobbiamo fare override del metodo toString(), almeno.
        CTRL-O possiamo fare override di un metodo, e mettiamo che ritorni stringa vuota. rifacciamo il test
        ed è verde. Il test passa.
         */

    }
}
