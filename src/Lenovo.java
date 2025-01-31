public class Lenovo implements Computer{
    @Override
    public void configuration() {
        System.out.println("2GB RAM, 14 Inch Display, 500GB HDD");
    }

    @Override
    public void price(int price) {
        System.out.println(price);
    }
}
