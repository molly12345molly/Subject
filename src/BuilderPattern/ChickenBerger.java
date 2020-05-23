package BuilderPattern;
//创建扩展了汉堡的实体类
public class ChickenBerger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
