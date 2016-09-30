package section4;

/**
 * Created by rafael on 25/05/16.
 */
public class ByteShortInt {

    public static void main(String[] args) {

        /*
         * Valores mínimo e máximo de um long. Tem um tamanho máximo de 64 bits.
         * E preciso ter um 'L' no final do numero, que pode ser um 'l'.
         */
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        /*
         * Valores mínimo e máximo de um inteiro. Tem um tamanho máximo de 32 bits.
         * Os undercores '_' são apenas para melhorar a leitura do número. Foram introduzidos
         * no Java 7.
         * Esse tipo de entrada é conhecida como literal. Se fosse feito uso de variáveis,
         * seria conhecida como referência.
         */
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;

        /*
         * Valores mínimo e máximo de um short.  Tem um tamanho máximo de 16 bits.
         */
        short minShortValue = -32768;
        short maxShortValue = 32767;

        /*
         * Valores mínimo e máximo de um byte.  Tem um tamanho máximo de 8 bits.
         */
        byte minByteValue = -128;
        byte maxByteValue = 127;

        // EXERCISE!
        byte meuByte = 110;
        short meuShort = 27510;
        int meuInt = 1_345_632_919;
        long meuLong = 50000L + (10L * (meuByte + meuShort + meuInt));

        System.out.println("My long number is " + meuLong);
    }
}
