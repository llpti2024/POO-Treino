public final class Goldfish extends Peixe{
    public String tipo = "GOLDFISH";
    public void exibindo(){
        System.out.println("--------------------------------");
        System.out.println("Ele está no áquario se exibindo");
        System.out.println("--------------------------------");
    }
    public void descricao(){
        System.out.println(toString());
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        setTipo(tipo);
    }
}
