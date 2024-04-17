import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double divisor = 7;

         System.out.println("indique o numero para ser dividendo: ");
         double dividendo = scanner.nextDouble();
         
         double resto=(dividendo%divisor);
         if(resto==0){
            System.out.println("é divisivel por 7");
         }else{
            System.out.println("não é divisivel por 7");

         }
         scanner.close();

    }
}