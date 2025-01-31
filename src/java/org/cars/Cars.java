package java.org.cars;

abstract class Cars {

    public String type;
    public String colour;
    public double price;

    abstract void setSpecifications(double price);

    public Cars getSpecifications(){
        this.type = "sedan";
        this.colour ="red";
        return this;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}

