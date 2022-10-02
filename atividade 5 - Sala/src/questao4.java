import java.util.Scanner;


//4. Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através de somas
        //repetidas. (ex: 2 e 3 = 2 + 2 + 2).
public class questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 2 números a serem multiplicados");
        int numb1 = entrada.nextInt();
        int numb2 = entrada.nextInt();
        int formula=0;
        for (int i=0; i<numb2; i++){
            formula+=numb1;
        }
        System.out.println(formula);
    }
}
