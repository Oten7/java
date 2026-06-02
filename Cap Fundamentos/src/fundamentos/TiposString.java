package fundamentos;

public class TiposString {
    static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(0));

        String s = "Boa Tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa Tarde"));
        var nome = "Neto";
        var sobrenome = "Araujo";
        var idade = 19;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
