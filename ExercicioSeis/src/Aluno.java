/*Aluno é uma especialização de pessoa  e pessoa é uma generalização */
public class Aluno extends Pessoa {
    /*Colocando protegido para as subclasses poderem acessar*/
    protected int matr;
    protected String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + "\n");
    }
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada!");
    }

    public int isMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return

                "/////////////////  ALUNO  /////////////////\n" +
                "\nMATRICULA = " + "[" + this.matr + "]" +
                "\nCURSO     = " + "[" + this.curso + "]" +
                "\nNOME      = " + "- " + this.nome + " -" +
                "\nIDADE     = " + "|" + this.idade + "|" +
                "\nSEXO      = " + "[" + this.sexo + "]" +
                "\n\n//////////////////////////////////////////\n";
    }
}
