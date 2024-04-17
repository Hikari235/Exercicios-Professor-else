import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  //      Faça um programa que recebe a altura e o sexo (M/F) de uma pessoa e verifica se ela
//está dentro dos padrões de altura considerados normais para o sexo informado
//(homens com altura entre 160 e 190 cm, mulheres entre 150 e 180 cm).
 
        System.out.println("Indique seu genero entre F feminino e M masculino: ");
        char sexo = scanner.next().charAt(0);
        System.out.println("indique sua altura em metros (ex 1,80): ");
        double altura = scanner.nextDouble();

        if ( sexo=='f' || sexo=='F' &&altura==1.50 || altura==1.80){
            System.out.println("você esta dentro dos padrões de altura");
        }else if(sexo=='m' || sexo=='M' &&altura==1.60 || altura==1.90){
            System.out.println("você esta dentro dos padrões de altura");
        }else{
            System.out.println("você não esta dentro dos padrões");
        }

        scanner.close();
    }
}
