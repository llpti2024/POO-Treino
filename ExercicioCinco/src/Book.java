public class Book implements Publication {

    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Pessoa reader;



    public String details() {
        return "/////////////////  BOOK  /////////////////\n" +
                "\nTITLE         =  " + "|||" + title  + "|||" +
                "\nAUTHOR        =  " + "||" + author + "||" +
                "\nTOTAL PAGES   =  " + totalPages + " - |Pages|" +
                "\nCURRENT PAGE  =  " + currentPage + " - |Page|" +
                "\nOPEN          =  " + "**" + open + "**" +
                "\nREADER        =  " + "- " + reader.getName() + " -"+
                "\nAGE           =  " + reader.getAge() + " - |Years|" +
                "\nSEX           =  " + "/" + reader.getSex()+ "/" +
                "\n\n//////////////////////////////////////////\n" ;

    }

    public Book(String title, String author, int totalPages, Pessoa reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = false;
        this.reader = reader;
        this.currentPage  =0;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Pessoa getReader() {
        return reader;
    }

    public void setReader(Pessoa reader) {
        this.reader = reader;
    }


    @Override
    public void open() {
    this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void read(int page) {
        if(page > this.totalPages) {
            this.currentPage = 0;
        }else {
            this.currentPage = page;
        }
    }

    @Override
    public void advancePage() {
    this.currentPage++;
    }

    @Override
    public void backPage() {
    this.currentPage--;
    }
}
