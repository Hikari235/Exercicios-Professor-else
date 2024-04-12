import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua idade ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.printf("meus parabéns, você tem %d anos, ja pode ser preso", idade);
        }else{
            System.out.println("você ainda é muito criança, só com autorização dos pais ");
        }

        scanner.close();
        
    }
}
