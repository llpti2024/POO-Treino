public class Peixe extends Animal{
    protected String corEscama;
    protected String tipo = "PEIXE";

    public void soltarBolha(){
        System.out.println("--------------------------------");
        System.out.println("        Soltou uma bolha");
        System.out.println("--------------------------------");
    }

    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("            Nadando");
        System.out.println("--------------------------------");
    }
    @Override
    public void alimentar(){
        System.out.println("--------------------------------");
        System.out.println("       Comendo Substância");
        System.out.println("--------------------------------");
    }
    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("       Peixe não faz som");
        System.out.println("--------------------------------");
    }

    protected String getCorEscama() {
        return corEscama;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    @Override
    public String toString() {
        return "\n=====================  "+this.getTipo()+"  =====================\n" +
                "\nCOR DA ESCAMA    =   " + "|" + this.corEscama +  "|" +
                "\nPESO             =   " + "[" +  peso + "] |QUILOS|" +
                "\nIDADE            =   " + "{" +  idade + "} |ANOS|" +
                "\nMEMBROS          =   " + "* " +  membros + " *" +
                "\n\n=======================================================\n";
    }

}
