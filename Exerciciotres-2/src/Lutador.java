public class Lutador {
    private String name;
    private String nacionalidade,categoria ;
    private int idade ,vitorias, derrotas, empates, totalLutas;
    private double altura, peso;

    public Lutador(String name, String nacionalidade, int idade, double altura,  double peso, int vitorias, int derrotas, int empates) {
        this.name = name;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.peso= peso;
        this.totalLutas = vitorias + derrotas + empates;
    }

    public void apresentar(){
        System.out.println("==========================================================================");
        System.out.println("EU LHES APRESENTO UM DOS MAIORES LUTADORES PROFISSIONAIS ");
        System.out.println("|"+ getName() + "| que é da nacionalidade |" + getNacionalidade() + "|");
        System.out.println("ele que com apenas |" + getIdade() + "| anos e está com ");
        System.out.println("Total de |" + getTotalLutas() + "| Lutas ");
        System.out.println("==========================================================================");
    }
    public void status(){
        System.out.println("==========================================================================");
        System.out.println("O lutador |" + getName() + "| é da categoria |" + getCategoria() + "|");
        System.out.println("Com |" + getVitorias() + "| Vitórias e |" + getDerrotas() + "| Derrotas");
        System.out.println("Ele lutou um total de |" + getTotalLutas() + "| Lutas e empatou |" + getEmpates() + "|");
        System.out.println("==========================================================================");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    private void setTotalLutas(int totalLutas) {
        this.totalLutas = totalLutas;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso<52.2) {
            this.categoria = "Inválido";
        }else if (this.peso<=70.3){
            this.categoria = "Peso Leve";
        }else if(this.peso<=83.9){
            this.categoria= "Peso Médio";
        }else if(this.peso<=120.2){
            this.categoria = "Peso Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public int getTotalLutas() {
        return totalLutas;
    }







}
