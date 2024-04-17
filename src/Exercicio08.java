import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Desenvolva um programa que pede ao usuário para digitar um ano e verifica se é
//bissexto ou não. Um ano é bissexto se for divisível por 4, mas não por 100, a menos
//que também seja divisível por 400.
    double bissexto = 4;

        System.out.println("indique o ano: ");
        double ano = scanner.nextDouble();
         
    double resto=(ano%bissexto);

    if( resto==0){
        System.out.println("é um ano bissexto");
    }else{
        System.out.println("Não é um ano bissexto");

    }
    scanner.close();
    }
}
