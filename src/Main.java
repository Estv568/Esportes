public class Main {
    public static void main(String[] args) {

        Pessoa qualquer = new Pessoa();

        qualquer.setNome("Rebeca Andrade");
        System.out.println(qualquer.getNome());


    Esportista jogadora =  new Esportista();
    Esportista surfista = new Esportista();

    jogadora.setNome("Taisa do volei");
    System.out.println(jogadora.getNome());

    //polimorfismo
        Pessoa outra = new Pessoa();
        String retorno = outra.sacar();
        System.out.println(retorno);
        outra = new Esportista();
        retorno = outra.sacar();
        System.out.println(retorno);
        //
}
}