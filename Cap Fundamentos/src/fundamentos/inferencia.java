package fundamentos;

public class inferencia {
    public static void main(String[] args) {

        double a = 4.5; // declaracao e inicializacao
        System.out.println(a);

        // a = "...";

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5;

        double d; // variel foi declarada
        d = 123.65; // variavel foi inicializada
        System.out.println(d); // usada!

        var f = 12; // inteiro
//      f = 12.01; nao inicializa
        System.out.println(f);
    }
}
