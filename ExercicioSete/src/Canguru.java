public final class Canguru extends Mamifero {
    public String tipo = "CANGURU";

    public void usarBolsa(){
        System.out.println("--------------------------------");
        System.out.println("Abrir bolsa para filhote entrar");
        System.out.println("--------------------------------");

    }
    @Override
    public void locomover(){
        System.out.println("--------------------------------");
        System.out.println("            Saltando");
        System.out.println("--------------------------------");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
         setTipo(tipo);
    }

    public void descricao(){
        System.out.println(toString());
    }
}
