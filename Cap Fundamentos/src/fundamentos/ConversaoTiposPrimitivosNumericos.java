package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.567766565544; // explicta (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte)c; // explicta (CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int)e; // explicta (CAST)
        System.out.println(f);
    }
}
