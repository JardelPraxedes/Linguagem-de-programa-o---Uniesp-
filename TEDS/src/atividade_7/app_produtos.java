package atividade_7;

import javax.annotation.processing.SupportedOptions;

public class app_produtos {
    public static void main(String[] args) {
        produtos prod = new produtos();
        prod.setNome("Iphone");
        prod.setQuantidade(500);
        prod.setPreco(6200);
        System.out.println("Nome produto: " + prod.getNome());
        System.out.println("quantidade: " + prod.getQuantidade());
        System.out.println("Preço unitário: " +prod.getPreco());

    }

}
