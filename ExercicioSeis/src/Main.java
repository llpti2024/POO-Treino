public class Main {
    public static void main(String[] args) {
        /* Não podemos criar um objeto com uma classe abstrata
        Pessoa p1 = new Pessoa();
         */

        Aluno a1 = new Aluno();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        a1.setNome("Claudio");
        a1.setMatr(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        b1.setMatr(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5F);
        b1.setSexo("Masculino");
        b1.setIdade(18);
        b1.setCurso("JAVA");
        System.out.println(b1.toString());
        b1.pagarMensalidade();

/*
        a1.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        a1.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        a1.setIdade(18);
        p3.setIdade(32);
        p4.setIdade(15);

        a1.setCurso("Informática");
        p3.setSalario(2500.75F);
        p4.setSetor("Estoque");

        /*
        System.out.println(a1.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        */



    }
}