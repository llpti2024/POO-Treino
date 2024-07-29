public class Ave extends Animal{
    protected String corPena;
    protected String tipo = "AVE";

    public void fazerNinho(){
        System.out.println("--------------------------------");
        System.out.println("       Construiu o ninho");
        System.out.println("--------------------------------");
    }

    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("            Voando");
        System.out.println("--------------------------------");
    }
    @Override
    public void alimentar(){
        System.out.println("--------------------------------");
        System.out.println("        Comendo frutas");
        System.out.println("--------------------------------");
    }
    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("         Som de Ave");
        System.out.println("--------------------------------");
    }

    protected String getCorPena() {
        return corPena;
    }

    protected void setCorPena(String corPena) {
        this.corPena = corPena;
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
                "\nCOR DA PENA      =   " + "|" + corPena +  "|" +
                "\nPESO             =   " + "[" +  peso + "] |QUILOS|" +
                "\nIDADE            =   " + "{" +  idade + "} |ANOS|" +
                "\nMEMBROS          =   " + "* " +  membros + " *" +
                "\n\n=====================================================\n";
    }

}
