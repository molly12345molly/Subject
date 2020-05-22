package Factory;

public class FactoryPatternDemo {

    public static void main(String [] args){
        ShareFactory shareFactory=new ShareFactory();
//        获取circle对象，并调用它的方法
       Shape shape1= shareFactory.getShape("CIRCLE");
//    调用它的方法
        shape1.draw();




    }
}
