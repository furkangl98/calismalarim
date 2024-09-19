package gun1.kitapOkuma;

public class Reader {
    String name;
    int age;
    char sex;
    Book currentBook;
    int currentPage;

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(Book currentBook) {
        this.currentBook = currentBook;
    }
    public void read(Book book,int pagesRead){
        currentBook=book;
        this.currentPage+=pagesRead;
        System.out.println("Şu anda"+" "+currentBook.name +" "+ "kitabını okuyor ve okuduğu sayfa sayısı" +" "+ this.currentPage);

    }
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", currentBook=" + currentBook +
                ", currentPage=" + currentPage +
                '}';
    }

}
