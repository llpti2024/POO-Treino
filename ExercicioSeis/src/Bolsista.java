/*Aqui temos um exemplo de uma classe que é HERDEIRA de PESSOA e FILHA de ALUNO*/

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno " + this.getNome());
    }

    /*Aqui temos um exemplo de SOBREPOSIÇÃO (Polimorfismo)*/

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista pagamento facilitado\n");

    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public String toString() {
        return

                "/////////////////  BOLSISTA  /////////////////\n" +
                        "\nBOLSA     = " + "[" + this.bolsa + "] % de DESCONTO" +
                        "\nMATRICULA = " + "[" + this.matr + "]" +
                        "\nCURSO     = " + "[" + this.curso + "]" +
                        "\nNOME      = " + "- " + this.nome + " -" +
                        "\nIDADE     = " + "|" + this.idade + "|" +
                        "\nSEXO      = " + "[" + this.sexo + "]" +
                        "\n\n//////////////////////////////////////////\n";
    }
}
