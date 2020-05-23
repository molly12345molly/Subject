package BuilderPattern;
//实现packing接口的实现类
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
