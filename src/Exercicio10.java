import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("escreva seu salario (ex: 1520): ");
      int salarioAtual = scanner.nextInt();

      if(salarioAtual>1412){
        System.out.println("seu salario esta a cima do salario minimo atual");
      } else {
        System.out.println("seu salario esta abaixo do salario minimo atual");

      }
      
        scanner.close();

    
    }
}
