package gun1.kitapOkuma;

public class ReadTest {
    public static void main(String[] args) {
        Reader reader= new Reader();
        Book book=new Book();
        Author author=new Author();
        

        reader.setName("sabri");
        reader.setAge(26);
        reader.setSex('E');
        book.setName("Alice Harikalar Diyarında");
        book.setCategory("Fantastik");
        book.setTotalPage(300);
        reader.setCurrentBook(book);
        author.setName("abudubi");
        author.setAge(68);
        author.addBook(book);

        book.setAuthor(author);




       // author.setBooks( ); BUNU NASIL YAPICAZ içini Book[] türüyle doldurmam lazım o zaman öyle bir şey yapmak için de
        reader.read(book,45);
        reader.read(book,30);
        System.out.println(reader.currentBook.author.name);
        System.out.println();
        System.out.println();
        String readerInfo = reader.toString();
        System.out.println(readerInfo);




    }
}
