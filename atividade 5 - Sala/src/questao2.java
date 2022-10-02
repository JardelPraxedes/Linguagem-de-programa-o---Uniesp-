//2. Crie um algoritmo que leia um número e escreva a sequência de zero até o número.
import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int ref = 0;
        int valor = entrada.nextInt();
        while (ref<=valor){
            System.out.println(ref);
            ref++;
        }
    }
}
