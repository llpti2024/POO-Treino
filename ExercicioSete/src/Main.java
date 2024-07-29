public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c1 = new Canguru();
        Cachorro c2 = new Cachorro();
        Cobra c3 = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();



        m.setPeso(85.3F);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Caramelo");
        System.out.println(m.toString());
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c1.setCorPelo("Amarelo");
        c1.setIdade(3);
        c1.setMembros(4);
        c1.setPeso(55.83F);
        c1.descricao();
        c1.locomover();
        c1.usarBolsa();
        c1.alimentar();
        c1.emitirSom();

        c2.setCorPelo("Manchado");
        c2.setIdade(7);
        c2.setMembros(4);
        c2.setPeso(4.5F);
        c2.descricao();
        c2.locomover();
        c2.abanaRabo();
        c2.emitirSom();
        c2.enterrarOsso();
        c2.alimentar();


        r.setPeso(12.5F);
        r.setIdade(10);
        r.setMembros(4);
        r.setCorEscama("Vermelha");
        System.out.println(r.toString());
        r.locomover();
        r.alimentar();
        r.emitirSom();

        c3.setCorEscama("Vermelha/Verde");
        c3.setIdade(5);
        c3.setMembros(0);
        c3.setPeso(0.97F);
        c3.descricao();
        c3.locomover();
        c3.alimentar();
        c3.emitirSom();

        t.setCorDoCasco("Preto");
        t.setIdade(145);
        t.setPeso(8.5F);
        t.setMembros(4);
        t.descricao();
        t.locomover();
        t.alimentar();
        t.emitirSom();


        p.setPeso(0.35F);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Dourado");
        System.out.println(p.toString());
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        g.setCorEscama("Dourado/Preto");
        g.setIdade(5);
        g.setMembros(0);
        g.setPeso(0.45F);
        g.descricao();
        g.locomover();
        g.exibindo();
        g.alimentar();
        g.soltarBolha();
        g.emitirSom();


        a.setPeso(0.89F);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorPena("Branca");
        System.out.println(a.toString());
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        ar.setCorPena("Azul/Amarelo");
        ar.setIdade(76);
        ar.setMembros(2);
        ar.setPeso(3.12F);
        ar.descricao();
        ar.fazerNinho();
        ar.emitirSom();
        ar.locomover();
        ar.alimentar();







    }
}