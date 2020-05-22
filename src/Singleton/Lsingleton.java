package Singleton;
//懒汉式，线程不安全
public class Lsingleton {
    private static Lsingleton lsingleton;
    private Lsingleton(){
    }
    public static Lsingleton getLsingleton(){
        if(lsingleton==null){
            lsingleton=new Lsingleton();

        }
        return lsingleton;
    }
}
