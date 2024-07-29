public  class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    private String tipo = "GAFANHOTO";

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
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
                "\nLOGIN            =   " + "-" + this.login + "-" +
                "\nNOME             =   " + "|" + this.nome +  "|" +
                "\nIDADE            =   " + "[" +  this.idade + "] |ANOS|" +
                "\nSEXO             =   " + "{" + this.sexo + "} " +
                "\nEXPERIENCIA      =   " + "* " + this.experiencia + " *" +
                "\nTOTAL ASSISTIDO  =   " + "-" + this.totAssistido + "-" +
                "\n\n======================================================\n";
    }
}
