
package bookproject;

public class ReaderTest {
    public static void main(String[] args){
    Reader ayse=new Reader("ayse",20,'f');
    Author a1=new Author("Dostoyevski");
    Book book1=new Book("Suc ve Ceza",600,true,0,false);
    book1.setAuthor(a1);
    book1.setType(BookType.CHILDERN);
    while (!book1.isFinish()){
        ayse.read(book1);
    }
    }
}
