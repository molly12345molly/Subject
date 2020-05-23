package BuilderPattern;
//创建和扩展了实体类
public class Pepsi extends  CloldDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
