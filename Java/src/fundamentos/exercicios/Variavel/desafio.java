package fundamentos.exercicios.Variavel;

public class desafio {
    public static void main(String[] args) {
      // (F -  32) x  5/9 = C
        final double ajuste = 32;
        final double Fahrenheit = 86.5;

        double calculo = (Fahrenheit - ajuste) * 5/9.0;

        System.out.println("O resultado em celsius foi: " + calculo + "°C.");
    }
}


