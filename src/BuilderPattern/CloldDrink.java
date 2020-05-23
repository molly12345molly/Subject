package BuilderPattern;
//创建实现了item接口的抽象类，该类提供了默认的功能
public abstract class CloldDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public  abstract  float price();
}
