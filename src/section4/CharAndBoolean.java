package section4;

/**
 * Created by rafael on 30/09/16.
 */
public class CharAndBoolean {

    public static void main(String[] args) {

        // O tipo char só permite 1 caractere.
        char myChar = 'A';

        // Mas podemos utilizar o código unicode do caractere que queremos.
        char unicodeChar = '\u00A9';

        System.out.println("Unicode output is: " + unicodeChar);

        // Tipos boolean.
        boolean myBoolean = false;
        boolean isMale = true;

        // EXERCISE!!

        /*
         * Find the unicode value for the 'registered' symbol (unicode-table.com), create a variable of type char and
         * assign it the unicode value of that symbol and display it on screen.
         */

        char registered = '\u00AE';
        System.out.println("The symbol that matches with the unicode value 00AE is " + registered);
    }
}
