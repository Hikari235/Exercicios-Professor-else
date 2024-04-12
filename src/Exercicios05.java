import java.util.Scanner;

public class Exercicios05 {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("por favor, insira o Primeiro Numero: ");
    int numeroUm=scanner.nextInt();
    System.out.println("por favor, insira o Segundo Numero: ");
    int numeroDois=scanner.nextInt();

    System.out.println("por favor, insira o terceiro Numero: ");
    int numeroTres=scanner.nextInt();
    if (numeroUm > numeroDois & numeroUm > numeroTres ) {
        System.out.printf("o numero maior é o numero %d", numeroUm );
    } else if (numeroDois > numeroUm & numeroDois > numeroTres) {
        System.out.printf("o numero maior é o numero %d", numeroDois );
    }else{
        System.out.printf("o numero maior é o numero %d", numeroTres );
    }
    scanner.close();

}
}
