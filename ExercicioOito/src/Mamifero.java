public class Mamifero extends Animal{
    protected String corPelo;
    private String tipo = "MAMÍFERO";

    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("        Som de mamifero");
        System.out.println("--------------------------------");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.setTipo(tipo);
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
