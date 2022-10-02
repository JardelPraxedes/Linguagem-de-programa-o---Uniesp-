import java.util.Scanner;

//3. Crie um algoritmo que leia um número e escreva a sequência decrescente até o zero.
public class questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int ref = 0;
        int valor = entrada.nextInt();
        while (valor>=0){
            System.out.println(valor);
            valor--;
        }

    }
}
