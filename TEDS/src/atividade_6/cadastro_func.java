public class cadastro_func{
    int cod_fuc;
    String email;
    float salario;
    String nome;
    public void setCod_fuc(int cod_fuc){
        this.cod_fuc = cod_fuc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void aumentar_salario(float porcentagem){
        porcentagem = salario/porcentagem; //para pegar o valor inteiro do usuario e transformar no valor relativo da porcentagem 
        this.salario +=porcentagem; 
    }
    public void calcular_imposto(float salario_final){
        if (salario_final<=1903.98){
            System.out.println("Isento de imposto");
        } 
        else if (salario_final>1903.98 && salario_final<=2826.65){
            System.out.println("Imposto de 142.80");
        }
        else if (salario_final>2826.65 && salario_final<=3751.05){
            System.out.println("Imposto de 354.80");
        }
        else if (salario_final>3575.05 && salario_final<=4664.68){
            System.out.println("Imposto de 636.13");
        }
        else {
            System.out.println("Imposto de 869.36");
        }
    }
}