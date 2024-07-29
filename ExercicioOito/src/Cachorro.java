public class Cachorro extends Lobo {
    private String tipo = "CACHORRO";

    @Override
    public void emitirSom(){
        System.out.println("--------------------------------");
        System.out.println("          Au! Au! Au!");
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

    public void reagir(String frase){
       if(frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("olá")) {
           System.out.println("--------------------------------");
           System.out.println("         Abanar e Latir");
           System.out.println("--------------------------------");
       }else {
           System.out.println("--------------------------------");
           System.out.println("            Rosnar");
           System.out.println("--------------------------------");
       }
    }
    public void reagir(int hora, int min){
        if (hora<12) {
            System.out.println("--------------------------------");
            System.out.println("             Abanar");
            System.out.println("--------------------------------");
        }else if(hora>=18){
            System.out.println("--------------------------------");
            System.out.println("            Ignorar");
            System.out.println("--------------------------------");
        }else{
            System.out.println("--------------------------------");
            System.out.println("         Abanar e Latir");
            System.out.println("--------------------------------");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("--------------------------------");
            System.out.println("            Abanar");
            System.out.println("--------------------------------");
        } else {
            System.out.println("--------------------------------");
            System.out.println("         Rosnar e Latir");
            System.out.println("--------------------------------");
        }
        }

    public void reagir(int idade, float peso){
        if(idade<5) {
            if(peso<10){
                System.out.println("--------------------------------");
                System.out.println("            Abanar");
                System.out.println("--------------------------------");
            }else{
                System.out.println("--------------------------------");
                System.out.println("             Latir");
                System.out.println("--------------------------------");
            }
            if(peso>10){
                System.out.println("--------------------------------");
                System.out.println("            Rosnar");
                System.out.println("--------------------------------");
            }else{
                System.out.println("--------------------------------");
                System.out.println("            Ignorar");
                System.out.println("--------------------------------");
            }
        }
    }
}
