package gun1.kitapOkuma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author {
    String name;
    int age;

    List<Book> books=new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);

    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
