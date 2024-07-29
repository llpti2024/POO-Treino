/*Aqui temos um exemplo de uma classe que é HERDEIRA de PESSOA e FILHA de ALUNO*/

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar(){

    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
