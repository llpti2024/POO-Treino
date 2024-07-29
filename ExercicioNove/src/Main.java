public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("POO do básico ao avançado");
        v[1] = new Video("JAVA do básico ao avançado");
        v[2] = new Video("AWS do básico ao avançado");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "Masculino","Juba");
        g[1] = new Gafanhoto("Creuza", 12, "Feminino","Creuzita");

        Visualizacao vis[] = new Visualizacao[6];

        vis[0] =new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        /*System.out.println(vis[0].toString());*/
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(87.4F);
        System.out.println(vis[1].toString());
        /*vis[2] = new Visualizacao(g[0],v[2]);*/
        /*vis[2].avaliar(40.3F);*/
        /*System.out.println(vis[2].toString());*/

/*
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

*/
    }

}