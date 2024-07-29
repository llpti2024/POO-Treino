public final class Tartaruga extends Reptil {
    public String tipo = "TARTARUGA";
    private String corDoCasco;
    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("      Andando lentamente");
        System.out.println("--------------------------------");
    }
    public void descricao(){
        System.out.println(toString());
    }

    public String getCorDoCasco() {
        return this.getCorEscama();


    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        setTipo(tipo);
    }
    public void setCorDoCasco(String corDoCasco) {
        this.setCorEscama(corDoCasco);
    }
}
