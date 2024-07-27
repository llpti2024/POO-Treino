import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        int vetor;
        System.out.println("Quantos lutadores serão cadastrados ? ");
        vetor = input.nextInt();
        Lutador l = new Lutador("","",0,0F,0F,0,0,0);
        Lutador ll[] = new Lutador[vetor];

        for (int i=0; i<vetor; i++){

            System.out.println("Qual o nome do Lutador?");
            l.setName(input.next());
            System.out.println("Qual o País do Lutador ?");
            l.setNacionalidade(input.next());
            System.out.println("Qual a Idade do Lutador ?");
            l.setIdade(input.nextInt());
            //* Porque mesmo colocando float ou double ele nao funciona quando coloco o valor com . *//
            System.out.println("Qual a Altura do Lutador ?");
            l.setAltura(input.nextDouble());
            System.out.println("Qual o Peso do Lutador ?");
            l.setPeso(input.nextDouble());
            System.out.println("Quantas Vitórias tem o Lutador ?");
            l.setVitorias(input.nextInt());
            System.out.println("Quantas Derrotas tem o Lutador ?");
            l.setDerrotas(input.nextInt());
            System.out.println("Quantos Empates tem o Lutador ?");
            l.setEmpates(input.nextInt());
            ll[i] = new Lutador(l.getName(),l.getNacionalidade(),l.getIdade(),l.getAltura(),l.getPeso(), l.getVitorias(),l.getDerrotas(), l.getEmpates());
            System.out.println("=====================================================================================================");
        }
        for (int i=0; i<(vetor); i++){
            ll[i].apresentar();
            ll[i].status();
        }


        //* Outra tentativa *//
     /*   for (int i=0; i<vetor; i++){
            System.out.println("Qual o nome do Lutador?");
            cadastro.setNa(input.next());
            System.out.println("Qual o País do Lutador ?");
            cadastro.setPa(input.next());
            System.out.println("Qual a Idade do Lutador ?");
            cadastro.setId(input.nextInt());
            System.out.println("Qual a Altura do Lutador ?");
            cadastro.setAlt(input.nextFloat());
            System.out.println("Qual o Peso do Lutador ?");
            cadastro.setPes(input.nextFloat());
            System.out.println("Quantas Vitórias tem o Lutador ?");
            cadastro.setVit(input.nextInt());
            System.out.println("Quantas Derrotas tem o Lutador ?");
            cadastro.setDer(input.nextInt());
            System.out.println("Quantos Empates tem o Lutador ?");
            cadastro.setEmp(input.nextInt());
            l[i] = new Lutador(cadastro.getNa(),cadastro.getPa(),cadastro.getId(),cadastro.getAlt(),cadastro.getPes(),cadastro.getVit(), cadastro.getDer(),cadastro.getEmp());
            System.out.println("=====================================================================================================");
        }

        for (int i=0; i<(vetor-1); i++){
            l[i].apresentar();
            l[i].status();
        }



       //* Original começa aqui*//

      /*  Lutador[] l = new Lutador[6];

      l[0] = new Lutador("Pretty Boy", "França", 31, 1.75F, 68.9F, 11, 2, 1);
      l[1] = new Lutador("Putscript", "Brasil", 29, 1.68F, 57.8F, 14, 2, 3);
      l[2] = new Lutador("Dead Code", "Austrália", 28, 1.93F, 81.6F, 13, 0, 2);
      l[3] = new Lutador("Ufocobol", "Brasil", 37, 1.7F, 119.3F, 5, 4, 3);
      l[4] = new Lutador("Nerdaard", "EUA",30, 1.81F, 105.7F, 12, 2, 4 );
      l[5] = new Lutador("Snapshadow", "EUA", 35, 1.65F, 80.9F, 12, 2, 1);
              l[5].apresentar();
              l[5].status();
*/
    }
}