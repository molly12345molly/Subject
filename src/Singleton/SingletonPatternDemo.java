package Singleton;

public class SingletonPatternDemo {
    public  static  void main(String [] args){
//        不合法的构造函数
//        编译时错误
//        获取唯一可用的对象
        SingleObject object=SingleObject.getGetInstance();
        object.showMsg();
    }
}
