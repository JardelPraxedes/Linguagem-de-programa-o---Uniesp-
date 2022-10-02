import java.util.Random; //importando random
public class startar_cadastro {
    public static void main(String[] args) {
        cadastro_func cadastrar = new cadastro_func();
        Random random = new Random(); 
        cadastrar.setNome("Jardel Praxedes");
        cadastrar.setEmail("jardelpraxedes222@gmail.com");
        cadastrar.setSalario(3800);
        cadastrar.setCod_fuc(random.nextInt(10000)); //pegando n° aleatorio para cod do funcionario
        cadastrar.aumentar_salario(10);
        System.out.println("Código do funcionário: " + cadastrar.cod_fuc);
        System.out.println("nome do funcionário: " + cadastrar.nome);
        System.out.println("email do funcionário: " +cadastrar.email);
        System.out.println("valor do salário com aumento: " + cadastrar.salario);
        cadastrar.calcular_imposto(cadastrar.salario);
    }
}
