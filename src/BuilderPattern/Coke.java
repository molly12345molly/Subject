package BuilderPattern;
//创建和扩展了实体类
public class Coke extends  CloldDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
