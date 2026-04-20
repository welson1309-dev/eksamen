package EksamensTræning.chatGPTOpgaver.Biblotek;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();


    public void addBook(Book book){
        books.add(book);
        }

    public void printBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Book Cthulu = new Book("Cthulu and his kittens","HP lovecraft",1840);
    }
}
