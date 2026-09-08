package fundamentos;

public class OperadoresRelacionais {
    static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(30 != 7);

        double nota = 9.9;
        boolean bomCOmporatmento = false;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomCOmporatmento && passouPorMedia;

        System.out.println("tem desconto? " + temDesconto);

    }
}
