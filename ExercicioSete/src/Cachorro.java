public final class Cachorro extends Mamifero {
    public String tipo = "CACHORRO";
    public void enterrarOsso(){
        System.out.println("--------------------------------");
        System.out.println("        Enterrou o osso");
        System.out.println("--------------------------------");


        }
    public void abanaRabo(){
        System.out.println("--------------------------------");
        System.out.println("        Abanou o rabo !!");
        System.out.println("--------------------------------");


    }
    @Override
    public void emitirSom() {
        System.out.println("--------------------------------");
        System.out.println("           Latindo");
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
