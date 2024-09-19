package gun1.banka;

public class BankTest {
    public static void main(String[] args) {
        Customer c1= new Customer(1,"Furkan");
        CreditCard cc= new CreditCard("1",1000);
        c1.setCc(cc);
        cc.setOwner(c1);

        Customer c2=new Customer(2,"Sabri");
        CreditCard cc2= new CreditCard("2",500,c2);
        System.out.println(cc2.getOwner().name);
        System.out.println(c2.getCc().balance);

    }
}
