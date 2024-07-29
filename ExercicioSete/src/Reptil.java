public class Reptil extends Animal{
    protected String corEscama;
    protected String tipo = "RÉPTIL";

    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("         Rastejando             ");
        System.out.println("--------------------------------");
    }
    @Override
    public void alimentar(){
        System.out.println("--------------------------------");
        System.out.println("        Comendo Vegetais      ");
        System.out.println("--------------------------------");
    }
    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("        Som de Réptil");
        System.out.println("--------------------------------");
    }


    protected String getCorEscama() {
        return corEscama;
    }

    protected void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
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
                "\nCOR DA ESCAMA    =   " + "|" + corEscama +  "|" +
                "\nPESO             =   " + "[" +  peso + "] |QUILOS|" +
                "\nIDADE            =   " + "{" +  idade + "} |ANOS|" +
                "\nMEMBROS          =   " + "* " +  membros + " *" +
                "\n\n======================================================\n";
    }

}
