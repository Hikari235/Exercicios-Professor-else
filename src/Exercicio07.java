import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("digite uma letra");
            char letra = scanner.next().charAt(0);
           
     
        if(letra == 'a' || letra =='A'&&letra == 'e' || letra =='E'&& letra == 'i' || letra =='I'
        &&letra == 'o' || letra =='O'&&letra == 'u' || letra =='U')
        {
        System.out.printf("a letra  %c é uma vogal" , letra);
        }else{
            System.out.printf("a letra %c é uma consoante" , letra);
     
        }

        scanner.close();
    }}