public final class Cobra extends Reptil {
    public String tipo = "COBRA";
    @Override
    public void alimentar(){
        System.out.println("--------------------------------");
        System.out.println("         Comendo Ovos");
        System.out.println("--------------------------------");
    }
    public void descricao(){
        System.out.println(toString());
    }
@Override
    public void emitirSom(){
    System.out.println("--------------------------------");
    System.out.println("   Cobra faz som com a lingua");
    System.out.println("--------------------------------");
}
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        setTipo(tipo);
    }
}
