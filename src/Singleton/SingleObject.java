package Singleton;

public class SingleObject {

//    创建单利的一个对象
    private  static SingleObject instance=new SingleObject();


//    让构造的函数为private，这样的类不会被实例化
    private SingleObject(){};
//    获取唯一可用的对象


    public static SingleObject getGetInstance() {
        return instance;
    }

//    展示信息
    public void showMsg(){
        System.out.println("hello word");
    }
}
