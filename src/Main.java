public class Main {
    public static void main(String[] args) {
        int inteiro0 = 10;
        System.out.println("O numero do tipo primitivo 'int' = " + inteiro0);

        Integer inteiro1 = inteiro0;
        System.out.println("O numero do tipo wrapper 'Integer' = " + inteiro1);


        double double0 = 2.5;
        System.out.println("O numero do tipo primitivo 'double' = " + double0);

        // É necessário realizar o casting explícito aqui, uma vez que o tipo double ocupa 64 bits na memória,
        // enquanto o float consome apenas 32 bits.
        float float0 = (float) double0;
        System.out.println("O numero do tipo primitivo 'float' = " + float0);

    }
}
