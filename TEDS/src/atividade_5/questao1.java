//1. Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. Assuma que as variáveis
// de inteiro sum e count foram declaradas.
public class questao1 {
    public static void main(String[] args) {
       int soma=0;
       for(int cont=0; cont<=99; cont++){
           if(cont%2!=0){
               soma+=cont;
           }
        }
        System.out.println("a soma dos números impares entre 1 a 99 é igual a " + soma);
    }
}