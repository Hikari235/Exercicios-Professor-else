import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("indique os graus Celcios: ");
    int celcios = scanner.nextInt();

    int fahrenheit = (celcios * 9/5) + 32; 

    if ( fahrenheit > -49135){
        System.out.printf("meus parabens, o grau em Fahrenheit é %d ", fahrenheit);
    } else { 
        System.out.println("perigo, esta em 0 absoluto");
    }
    scanner.close();

    }
}
