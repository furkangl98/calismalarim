package gun1.banka;

public class Customer {
    int id;
    String name;
    CreditCard cc;
//    public Customer(int id,String name,CreditCard cc){
//        this.id=id;
//        this.name=name;
//        this.cc=cc;
//        cc.setOwner(this);
//
//    }

    public Customer(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
    }

    public CreditCard getCc() {
        return cc;
    }
}
