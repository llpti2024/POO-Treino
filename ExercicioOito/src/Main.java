public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        m.setMembros(4);
        m.setPeso(2.2F);
        m.setIdade(2);
        m.setCorPelo("Amarelo");
        System.out.println(m.toString());
        m.emitirSom();

        l.setMembros(4);
        l.setPeso(34.3F);
        l.setIdade(5);
        l.setCorPelo("Preto");
        l.descricao();
        l.emitirSom();

        c.setPeso(16.3F);
        c.setMembros(4);
        c.setIdade(12);
        c.setCorPelo("Dourado");
        c.descricao();
        c.emitirSom();
        c.reagir("Olá");
        c.reagir("vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5F);
        c.reagir(17,4.5F);



    }
}