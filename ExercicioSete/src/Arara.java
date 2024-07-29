public final class Arara extends Ave {
    public String tipo = "ARARA";
    @Override
    public void emitirSom() {
        System.out.println("--------------------------------");
        System.out.println("     Arara está Cantando");
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