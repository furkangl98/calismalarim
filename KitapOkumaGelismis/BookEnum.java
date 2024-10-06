package gun1.KitapOkumaGelismis;

public enum BookEnum {
    BOOK1("Yüzüklerin Efendisi",300),
    BOOK2("Küçük Prens",50),
    BOOK3("Diyaloglar",500),
    BOOK4("Od",400),
    BOOK5("Böyle Buyurdu Zerduşt",300);




    final String title;
    final int totalPage;
    BookEnum(String title, int totalPage){
        this.title=title;
        this.totalPage=totalPage;
    }


}
