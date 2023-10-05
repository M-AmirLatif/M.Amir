
public class Main {
    public static void main(String[] args) {
        //Product P1 = new Product("Bag",500,3,new Date(2,"jan",2005));
        //Product P2 = new Product("Geometry",300,2,new Date(5, "feb",2023));
        //Date D1 = new Date(3,9,2023);
        //System.out.println(P1.toString());
        //System.out.println(P2.toString());
        //System.out.println("--------------------------------------------------------------------");
        //System.out.println("Recent Product bought : "+P1.recentProduct(P1,P2));
        Deck deck1=new Deck();
        deck1.displayCards();
        System.out.println("hello amir don");
        deck1.shuffle();
        deck1.displayCards();
    }
}