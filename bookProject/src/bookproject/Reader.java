
package bookproject;

public class Reader {
     private String name;
     private int age;
     private char gebder;

    public Reader(String name, int age, char gebder) {
        this.name = name;
        this.age = age;
        this.gebder = gebder;
    }

    public void read(Book book){
        System.out.println(name+" is reading "+book.getTitle());
       System.out.println("Current page is "+book.increaseCurrentPageByOne());
       book.increaseCurrentPageByOne();
    }
     
}
