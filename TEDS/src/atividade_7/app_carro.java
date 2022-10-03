package atividade_7;

public class app_carro{
    public static void main(String[] args) {
        carro novo = new carro();
        roda novo2 = new roda();
        novo.setMarca("Uno");
        novo.setModelo("Toro");
        novo.setAno(2022);
        novo2.setAro(13);
        novo2.setMarca_pneu("Brigstone");
        System.out.println("Marca: " + novo.getMarca());
        System.out.println("Modelo: " + novo.getModelo());
        System.out.println("Ano: " + novo.getAno());
        System.out.println("tipo de aro: " + novo2.aro());
        System.out.println("marca pneu: " + novo2.marca_pneu());


    }

}
