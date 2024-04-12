import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota: ");
        double nota=scanner.nextDouble();

        if (nota >= 6) {
            System.out.println("parabéns, você esta aprovado!");
        }else{
            System.out.println("meus pesames, você foi reprovado -_-'");

}
scanner.close();

}
}