package section4;

/**
 * Created by rafael on 25/05/16.
 */
public class FloatAndDouble {

    public static void main(String[] args) {

        /*
         * Float tem 32 bits.
         * Double tem 64 bits.
         * Vejamos as implementações.
         */
        int myInteger = 5;
        System.out.println("This is a integer: " + myInteger);
        float myFloat = 5f;
        System.out.println("This is a float: " + myFloat);
        double myDouble = 5d;
        System.out.println("This is a double: " + myDouble);

        int myOtherInteger = myInteger / 2;
        System.out.println("The division of the integer by 2 is : " + myOtherInteger);
        float myOtherFloat = myFloat / 2f;
        System.out.println("The division of the float by 2 is : " + myOtherFloat);
        double myOtherDouble = myDouble / 2d;
        System.out.println("The division of the double by 2 is : " + myOtherDouble);

        //EXERCISE!!

        /*
         * Convert a given number of pounds in kilograns.
         * 1 pound is equal to 0.45359237 kilograns.
         */
        double pounds = 200d;
        double kilograns = 0.45359237d;
        double total = pounds * kilograns;
        System.out.println(total);
    }
}
