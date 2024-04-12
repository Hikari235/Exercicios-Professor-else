import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano = 2024;
        
        System.out.println("por favor, coloque o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = (ano - anoNascimento);

        if (idade >= 18) {
            System.out.printf("meus parabéns, você tem %d anos, ja pode ser preso", idade);
        }else{
            System.out.println("você ainda é muito criança, só com autorização dos pais ");
        }
        scanner.close();
    }
}
