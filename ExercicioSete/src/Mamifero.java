public class Mamifero extends Animal{
    protected String corPelo;
    protected String tipo = "MAMÍFERO";

    /*
    public Mamifero(String corPelo, float peso, int idade, int membros ) {
        this.corPelo = corPelo;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

     */
    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("            Correndo");
        System.out.println("--------------------------------");

    }
    @Override
    public void alimentar(){
        System.out.println("--------------------------------");
        System.out.println("            Mamando");
        System.out.println("--------------------------------");
    }
    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("         Som de Mamífero");
        System.out.println("--------------------------------");
    }

    protected String getCorPelo() {
        return corPelo;
    }

    protected void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n=====================  "+this.getTipo()+"  =====================\n" +
                "\nCOR DO PELO      =   " + "|" + corPelo +  "|" +
                "\nPESO             =   " + "[" +  peso + "] |QUILOS|" +
                "\nIDADE            =   " + "{" +  idade + "} |ANOS|" +
                "\nMEMBROS          =   " + "* " +  membros + " *" +
                "\n\n======================================================\n";
    }
}
