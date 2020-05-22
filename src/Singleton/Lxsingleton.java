package Singleton;
//懒汉式，线程安全
public class Lxsingleton {
    private  static  Lxsingleton lxsingleton;
    private Lxsingleton(){}
    public  static synchronized  Lxsingleton getLxsingleton(){
        if (lxsingleton==null){
            lxsingleton=new Lxsingleton();
        }
        return lxsingleton;
    }
}
