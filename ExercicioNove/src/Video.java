public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private String tipo = "VIDEO";

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;

    }

    @Override
    public void pause() {
        this.reproduzindo = false;

    }

    @Override
    public void like() {
        this.curtidas++;

    }
    @Override
    public String toString() {
        return "\n=====================  "+this.getTipo()+"  =====================\n" +
                "\nTITULO            =   " + "||" + this.titulo + "||" +
                "\nAVALIAÇÃO         =   " + "-" + this.avaliacao +  "-" +
                "\nVIEWS             =   " + "[" +  this.views + "]" +
                "\nCURTIDAS          =   " + "{" + this.curtidas + "} " +
                "\nREPRODUZINDO      =   " + "* " + this.reproduzindo + " *" +
                "\n\n======================================================\n";
    }
}
