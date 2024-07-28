public class Main {
    public static void main(String[] args) {
    Pessoa[] pessoa = new Pessoa[6];
    Book[] book = new Book[6];

    pessoa[0] = new Pessoa("Peter",22,"Male");
    pessoa[1] = new Pessoa("Marie", 25,"Female");

    book[0] = new Book("Learning Java","Joseph Damon",300,pessoa[0]);
    book[1] = new Book("OOP for beguinners","Peter Paul",500,pessoa[1]);
    book[2] = new Book("Advanced Java","Marie Sprint",800,pessoa[0]);

    //Abrindo o Livro e Foleando ele até a página 200 e avançado uma página//
    book[0].open();
    book[0].read(100);
    book[0].advancePage();

    //Mostrando os detalhes dos livros//
    System.out.println(book[0].details());
    System.out.println(book[1].details());
    System.out.println(book[2].details());


    }
}