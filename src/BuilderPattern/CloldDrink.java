package BuilderPattern;

public abstract class CloldDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public  abstract  float price();
}
