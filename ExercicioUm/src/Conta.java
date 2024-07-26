public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private float  saldo;
    private boolean status;
    private String abrirConta2;
    private String desejaDepositar;
    private String desejaSacar;
    private String pagarMensalidade2;

    public Conta() {
        setStatus(false);
        setSaldo(0);

    }

    public void abrirConta(){
        if(isStatus()==true){
            System.out.println("Conta Aberta!!!");

        } else if (isStatus()==false) {
            System.out.println("Conta Inexistente!!!");
        }
        if (isStatus()==true && getTipo().equalsIgnoreCase("CC")){
            setSaldo(getSaldo() + 50F);
            System.out.println("Você recebeu 50 reais por ter aberto uma Conta Corrente, "+getDono()+ " seu saldo atual é "+getSaldo());
        } else if(isStatus()==true && getTipo().equalsIgnoreCase("CP")){
            setSaldo(getSaldo() + 150F);
            System.out.println("Você recebeu 150 reais por ter aberto uma Conta Poupança, "+getDono()+ " seu saldo atual é "+getSaldo());
        }
        }


    public void fecharConta(){
        if(getSaldo()>0 && getSaldo()==0){
            System.out.println("Conta Finalizada!!");

        }

    }
    public void depositar(int depositar){
        if (isStatus()){
            setSaldo(getSaldo() + depositar);
            System.out.println(getDono() + " Depositou " + depositar + " Reais. Sua conta tem " + getSaldo() + " agora.");
        }
    }
    public void sacar(int sacar){
        if(isStatus()==true && getSaldo()>0 || getSaldo()==sacar) {
                setSaldo(getSaldo() - sacar);
                System.out.println(getDono() + " Sacou " + sacar + " Reais. Sua conta tem " + getSaldo() + " agora.");
            } else { System.out.println("Saldo Insuficiente");

        }
    }
    public void pagarMensalidade(){
            if (getTipo().equalsIgnoreCase("CC")){
             setSaldo(getSaldo()- 12);
             System.out.println("Você pagou 12 reais de mensalidade Dono: "+getDono()+ " seu saldo atual é "+getSaldo());
        }else  if (getTipo().equalsIgnoreCase("CP")){
            setSaldo(getSaldo()-20);
            System.out.println("Você pagou 20 reais de mensalidade Dono: "+getDono()+ " seu saldo atual é "+getSaldo());
        }

    }

    public void statusDaConta(){
            System.out.println("---------------------------------------------------");
            System.out.println("O número da conta é : " + getNumConta());
            System.out.println("O Dono da conta é : " + getDono());
            System.out.println("O Tipo da conta é : " + getTipo());
            System.out.println("O Saldo da conta é : " + getSaldo());
            System.out.println("O Status é : " + isStatus());
            System.out.println("---------------------------------------------------");

    }
    public String getAbrirConta2() {
          return abrirConta2;
    }

    public void setAbrirConta2(String abrirconta) {
        this.abrirConta2 = abrirconta;
        if (getAbrirConta2().equalsIgnoreCase("S")){
            setStatus(true);

        } else if (getAbrirConta2().equalsIgnoreCase("N")){
            setStatus(false);
        }
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDesejaDepositar() {
        return desejaDepositar;
    }

    public void setDesejaDepositar(String desejaDepositar) {
        this.desejaDepositar = desejaDepositar;
    }
    public String getDesejaSacar() {
        return desejaSacar;
    }

    public void setDesejaSacar(String desejaSacar) {
        this.desejaSacar = desejaSacar;
    }
    public String getPagarMensalidade2() {
        return pagarMensalidade2;
    }

    public void setPagarMensalidade2(String pagarMensalidade2) {
        this.pagarMensalidade2 = pagarMensalidade2;
    }
}
