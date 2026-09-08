package fundamentos.exercicios;

public class desafioslogicos {
    static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        // operador unario
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete\"? " + comprouSorvete);

        System.out.println("MAis saudavel? " + maisSaudavel);
    }
}
