
package bookproject;

public class Book {
    private String title;
    private int pageCount;
    private boolean hardCover;
    private int currentPage;
    private boolean finish;
    private Author author;
    private BookType type;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int increaseCurrentPageByOne(){
            currentPage++;
        if (currentPage==this.pageCount){
            System.out.println("I finished the book");
            finish=true;
        }
        return currentPage;
    }
    public Book(String title, int pageCount, boolean hardCover, int currentPage, boolean finish) {
        this.title = title;
        this.pageCount = pageCount;
        this.hardCover = hardCover;
        this.currentPage = currentPage;
        this.finish = finish;
    }
    
  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
    
    
    
    
}
