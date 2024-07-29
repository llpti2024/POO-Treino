public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    protected String tipo = "ANIMAL";

    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n=====================  "+this.getTipo()+"  =====================\n" +
                "\nPESO             =   " + "[" +  peso + "] |QUILOS|" +
                "\nIDADE            =   " + "{" +  idade + "} |ANOS|" +
                "\nMEMBROS          =   " + "* " +  membros + " *" +
                "\n\n======================================================\n";
    }
}

