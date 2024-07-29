public class Lobo extends Mamifero{
    private String tipo = "LOBO";

    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("          Auuuuuuuuuuu!");
        System.out.println("--------------------------------");
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.setTipo(tipo);
    }
    public void descricao(){
        System.out.println(toString());
    }
}
