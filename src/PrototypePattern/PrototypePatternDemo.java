package PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape=ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());

        Shape clonedShape2=ShapeCache.getShape("2");
        System.out.println(clonedShape2.getType());

    }
}
